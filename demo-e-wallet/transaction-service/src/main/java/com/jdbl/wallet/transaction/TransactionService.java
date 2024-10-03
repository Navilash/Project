package com.jdbl.wallet.transaction;

import java.util.UUID;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class TransactionService {   
	
	
	private static final String TXN_CREATE_TOPIC="txn_create";
	
	private static final String TXN_COMPLETE_TOPIC="txn_complete";
	
	private static final String WALLET_UPDATE_TOPIC="wallet_update";
	
	@Autowired
	TransactionRepo    transactionrepo;
	
	@Autowired
	KafkaTemplate<String,String>  kafkaTemplate;  
	
	@Autowired
	RestTemplate restTemplate;
	

	public String createtxn(Transaction transaction) {   
		
		

		transaction.setTxnId(UUID.randomUUID().toString());
		
		transaction.setTransactionStatus(TransactionStatus.PENDING); 
		
		
		transactionrepo.save(transaction);  
		
		
		JSONObject  jsonObject  =  new  	JSONObject();
			
		jsonObject.put("sender", transaction.getSenderUserId());
		
		jsonObject.put("reciever", transaction.getReceiverId());
		
		jsonObject.put("amount", transaction.getAmount());
		
		jsonObject.put("txnId", transaction.getTxnId());
		
		kafkaTemplate.send(TXN_CREATE_TOPIC,jsonObject.toJSONString());   
		
		return transaction.getTxnId();      
		
		
	}
	
	@KafkaListener(topics= WALLET_UPDATE_TOPIC ,groupId="jdbl61_grp")
	public void  updatetxn(String msg) throws ParseException {
	
	
		
		JSONObject  jsonObject  =  (JSONObject) new  	JSONParser().parse(msg);  
		
		String txnId=  (String) jsonObject.get("txnId");
		String status = (String) jsonObject.get("status");
		
		
		
		TransactionStatus  transactionStatus;
		
		if("FAILED".equals(status))
		{
			transactionStatus=TransactionStatus.FAILED;
		}
		
		else
		{
			transactionStatus=TransactionStatus.SUCESSFULL;
		}
		
		Transaction  transaction=  transactionrepo.findByTxnId(txnId);
		
		transaction.setTransactionStatus(transactionStatus);  
		
		transactionrepo.save(transaction);  
		
		//  HTTP WAY OF COMMUNICATION BETWEEN SERVICS 
		
		Integer  senderId=  transaction.getSenderUserId();
		
		Integer  receiverId= transaction.getReceiverId();
		
	  JSONObject  sender=	restTemplate.getForObject("http://localhost:8083/user?id=" + senderId,JSONObject.class);
	  
	  JSONObject  reciever=	restTemplate.getForObject("http://localhost:8083/user?id=" + receiverId,JSONObject.class);
		
     String senderEmail=     (String) sender.get("email");
     
     String recieverEmail=     (String) reciever.get("email");
		
		
	
		
		
		JSONObject txnCompleteEvent  =  new JSONObject();
		txnCompleteEvent.put("txnId",txnId);
		txnCompleteEvent.put("sender",senderEmail);
		txnCompleteEvent.put("reciever",recieverEmail);
		txnCompleteEvent.put("status",transaction.getTransactionStatus().name());
		txnCompleteEvent.put("amount",transaction.getAmount());
		
		
		
		
	
		//  details  -  sender , status,txn id,amount
		//  receiver  -   credit,status,amount,sender
		
		
		
		
		kafkaTemplate.send(TXN_COMPLETE_TOPIC,txnCompleteEvent.toJSONString());
		
		
		
		//return transaction.getTxnId();
	}


}

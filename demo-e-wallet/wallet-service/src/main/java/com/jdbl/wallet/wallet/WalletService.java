package com.jdbl.wallet.wallet;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class WalletService {
	
	
	
	public static final String     USER_CREATE_TOPIC="user_create" ;   

	public static final String     TXN_CREATE_TOPIC="txn_create" ;  
	
	public static final String     WALLET_UPDATE_TOPIC="wallet_update" ; 
	
	int onboardingAmount=50;
	
	
	
	@Autowired
	private WalletRepository   walletRepo;
	
	@Autowired
	KafkaTemplate<String,String>  kafkatemplate;
	
	// acting as a consumer wrt to user service
	@KafkaListener(topics = {USER_CREATE_TOPIC},groupId="jdbl61_grp")
	public  void createWallet(String message) throws Exception
	{
		
		JSONObject   jsonobj = (JSONObject) new JSONParser().parse(message);
		
		if(!jsonobj.containsKey("userId"))
		{
			throw new Exception("userId   is not present in the user event");
		}
		
    // 	int userId = (int) jsonobj.get("userId");
		
		 int userId = ((Long) jsonobj.get("userId")).intValue();
		
		Wallet   wallet  =  Wallet.builder().balance(onboardingAmount).
				userId(userId).
				build();
				
		 walletRepo.save(wallet);
		
	}
	
	//  here it will  act as a consumer wrt to transaction -  there is update request to the wallet 
	
	//  will act as  producer to   transaction to give wallet update success
	
	
	@KafkaListener(topics = TXN_CREATE_TOPIC  ,groupId="jdbl27_grp" )
	public void updateWallet(String message) throws Exception
	{
		
		
		JSONObject   jsonobj = (JSONObject) new JSONParser().parse(message);
		
	
     //   to  update wallet  list of info
	
	//   sender Id?

		//  Receiver Id
		
		//  Amount to be sent or deducted
		
		//   txn id
		


		
		if   (!jsonobj.containsKey("sender")     ||
				!jsonobj.containsKey("reciever") ||  
				!jsonobj.containsKey("txnId")    ||
				!jsonobj.containsKey("amount"))  
	
		{  
			
			throw new Exception(" thses are  not present in the txn event");
		}
		
		System.out.println("Received message: " + jsonobj.toJSONString());
		
		Integer  receiverId =  ((Long) jsonobj.get("reciever")).intValue();
		
		Integer  senderId =  ((Long) jsonobj.get("sender")).intValue();
		
		Double  amount =  (Double) jsonobj.get("amount");
		
		String  txnId =  (String) jsonobj.get("txnId");   
		
		
		JSONObject   walletUpdateEvent  =  new   JSONObject();
		
		walletUpdateEvent.put("txnId", txnId);
		
		
		Wallet  wallet  =     walletRepo.findByUserId(senderId);   
		
		
		
		if(wallet.getBalance() <amount)
		{
			walletUpdateEvent.put("status","FAILED");
			
		}
		else
		{
			
			 walletRepo.updateWallet(receiverId, amount);
			 walletRepo.updateWallet(senderId, 0-amount);
			
			walletUpdateEvent.put("status","SUCESSFULL");
		}
		
	
		 kafkatemplate.send( WALLET_UPDATE_TOPIC,walletUpdateEvent.toJSONString());
		
	}
	
}

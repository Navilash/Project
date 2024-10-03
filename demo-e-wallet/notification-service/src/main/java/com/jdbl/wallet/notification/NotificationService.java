package com.jdbl.wallet.notification;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

	private static final String TXN_COMPLETE_TOPIC="txn_complete";
	
	@Autowired
	SimpleMailMessage   simpleMailMessage ;  
	
	@Autowired
	JavaMailSender   javaMailSender;  
	
	
	
	
	@KafkaListener(topics = {TXN_COMPLETE_TOPIC}, groupId = "jbdl61_grp")
	public void sendNotifi(String msg) throws ParseException
	{
		JSONObject  jsonObject  =  (JSONObject) new  	JSONParser().parse(msg);
		
		  System.out.println(  jsonObject    +  "   in send Notify");
		 
		String txnId= (String) jsonObject.get("txnId");  
		
		String status= (String) jsonObject.get("status");
		
		String senderEmail= (String) jsonObject.get("sender");
		
		String receiverEmail= (String) jsonObject.get("reciever");
		
		Double amount= (Double) jsonObject.get("amount");   
		
		simpleMailMessage.setText("Hi  Your txnId  is "  +  txnId + "  "   + "got"  +  status );
		
		simpleMailMessage.setTo(senderEmail);  
		
		simpleMailMessage.setSubject("  payment from  java 61");
		
		
        javaMailSender.send(simpleMailMessage);
        
        System.out.println(simpleMailMessage  +"  in Notification Service");
		
	
		
		
		if("Sucessfull".equals(status))
		{
			//  send email  to receiver  
			
			simpleMailMessage.setText("Hi  You   got amount from "  +  amount + "  "    +  senderEmail+ " in your wallet" );
			simpleMailMessage.setTo(receiverEmail); 
			javaMailSender.send(simpleMailMessage);
			
			  System.out.println(simpleMailMessage  +"  in   sucessFull state");
			  System.out.println(javaMailSender  +"  in   sucessFull state");
			
		}
		
		
		
	}
	
}

package com.jdbl.wallet.user;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Userservice {
	
	
	private static final   String USER_CREATE_TOPIC ="user_create";
	
	
	@Autowired
	KafkaTemplate<String,String>  kafkaTemplate;
	
	
	@Autowired
	UserRepository    userRepository;   
	
	

	public User create(User user) {
		
      	user=  userRepository.save(user);
      	
      	JSONObject   jsonObject  = new   	JSONObject();
      	
      	jsonObject.put("userId", user.getId());
    	jsonObject.put("userEmail", user.getEmail());
    	jsonObject.put("userContact", user.getContact());
      	
    	kafkaTemplate.send(USER_CREATE_TOPIC,jsonObject.toJSONString());
    	
			
		return user;
	}

	
	
	
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return     userRepository.findById(id).orElse(null);
	}

	
	
}

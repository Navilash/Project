package com.jdbl.wallet.user;

import java.util.Properties;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class UserConfig {

	
	
	  /*  2 Steps Required
	   * 
	   * 1.add  kafka Config
	   * 
	   * 2.to add kafka   config to kafka template 
	   * 
	   * 3.  publish the  message 
	   * 
	   * 4.  User will act as only Producer
	   * 
	   * 5.we need to add only producer config
	   * 
	   */
	
	
	public Properties getProducerConfigs() {
		
		
		Properties   prop =   new Properties();
		
		prop.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		prop.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		prop.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,StringSerializer.class);
		
		
		return prop;
	}  
	
	ProducerFactory<String,String>    getProducerFactory()
	{
		
		
		return    new DefaultKafkaProducerFactory(getProducerConfigs());
		
	}
	
	@Bean
	KafkaTemplate<String, String> getKafkaTemplate()
	{
		
		return new  KafkaTemplate<>(getProducerFactory());
		
	}
	
//	@Bean
//	ObjectMapper getMapper()   //  it is used to convert  java object  to string 
//	{
//		return new ObjectMapper();
//	}
//	

	
	
}

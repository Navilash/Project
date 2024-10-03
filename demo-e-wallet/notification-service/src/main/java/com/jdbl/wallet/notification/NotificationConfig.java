package com.jdbl.wallet.notification;

import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.Deserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration 
public class NotificationConfig {

	  
	Properties getConsumerConfig()
	{
		
		Properties   prop  = new Properties();
		
		

		prop.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,"localhost:9092");
		
		prop.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, Deserializer.class);
		
		prop.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,Deserializer.class);
		
		return prop;

	}   
	
	
	@Bean
	ConsumerFactory<String,String>  getConsumerFactory()
	{
		
		return new DefaultKafkaConsumerFactory(getConsumerConfig());
		
	}   
	
	
	@Bean
	JavaMailSender    getMailSender()
	{
		JavaMailSenderImpl   javaMailSender   = new  JavaMailSenderImpl();
		
		javaMailSender.setHost("smtp.gmail.com");
		javaMailSender.setPort(587);
		javaMailSender.setUsername("jdbl2951@gmail.com");
		javaMailSender.setPassword("jdbl295l.com");
		
		
		Properties prop =  javaMailSender.getJavaMailProperties();
		
		prop.put("mail.smtp.starttls.enable",true);
		prop.put("mail.debug",true);
		
		
		return  javaMailSender;
		
	}
	
	
	@Bean
	SimpleMailMessage getSimpleMailMsg()
	{
		return new  SimpleMailMessage();
	}
	
	
	
	
	
	
	
	
}

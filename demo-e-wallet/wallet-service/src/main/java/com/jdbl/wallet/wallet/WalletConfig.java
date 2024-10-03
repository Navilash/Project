package com.jdbl.wallet.wallet;

import java.util.Properties;

import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

@Configuration
public class WalletConfig {

	//  serialize   ->    will  convert  java object  to Jsonstring to  understand kafka
	
	//  deserialize  ->   // wil convert  json String  to java  object
	
	
	Properties getProducerConfig()
	{
		Properties   prop  = new Properties();
		
		prop.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,"localhost:9092");
		
		prop.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		
		prop.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,StringSerializer.class);
		
		return prop;
		
	}
	

	
	
		ProducerFactory<String,String>  getProducerFactory()
		{
			
			return new DefaultKafkaProducerFactory(getProducerConfig());
			
		}
		
	
		
		
	@Bean
	KafkaTemplate<String,String>   getKafkaTemplate(){
		
		
		return new  KafkaTemplate( getProducerFactory());
	}
	   
	
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
	
	
	
	
}

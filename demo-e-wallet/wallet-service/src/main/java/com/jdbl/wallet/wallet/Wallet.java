package com.jdbl.wallet.wallet;

import java.sql.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Builder
@Getter
@Setter  
@AllArgsConstructor
@NoArgsConstructor
public class Wallet {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private  int id;
	
	private  int balance;
	
	private int userId;
	
	
	@CreationTimestamp
	private Date createdOn;
	
	@UpdateTimestamp
	private  Date updatedOn;

}

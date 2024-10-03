package com.jdbl.wallet.transaction;

import java.sql.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//  if 3.5  years  above you  should know System design 

 //  elevator System  or parking lot  or youtube design


@Entity
@Builder
@Getter
@Setter  
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {
	
	
	
	@Id
	@GeneratedValue(strategy =   GenerationType.IDENTITY)
	private  int id;
	
	private  String txnId;
	
	
	private int senderUserId;
	
	private  int receiverId;
	
	
	private Double amount;
	
	private String purpose;
	
	
	@CreationTimestamp
	private Date createdOn;
	
	
	@UpdateTimestamp  
	private  Date updatedOn;
	
	
	@Enumerated(value=EnumType.STRING)
	private TransactionStatus    transactionStatus;
	
	
	
	


}

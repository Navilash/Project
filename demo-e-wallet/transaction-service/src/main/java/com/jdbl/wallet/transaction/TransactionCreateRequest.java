package com.jdbl.wallet.transaction;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter  
@AllArgsConstructor
@NoArgsConstructor
public class TransactionCreateRequest {

	
	private Integer senderUserId;
	
	private Integer  receiverUserId;
	
	private Double amount;
	
	private String purpose;   
	
	
	public Transaction to()
	{
		
		return Transaction.builder().senderUserId(senderUserId).
				receiverId(receiverUserId)
				.amount(amount)
				.purpose(purpose)
				.build();   
		
		
			
	}
	
	
	
	
	
	
	
}

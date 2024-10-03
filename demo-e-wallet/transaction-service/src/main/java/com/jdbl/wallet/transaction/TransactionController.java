package com.jdbl.wallet.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {

	@Autowired
	TransactionService  transactionService;
	
	
	@PostMapping("/transaction")
	public String  createTxn(@RequestBody TransactionCreateRequest   transactionCreateRequest  )
	{
		
		String  txnId= transactionService.createtxn(transactionCreateRequest .to()) ;
		return   "your Transaction has intiated"+txnId;
	
		
		
		
	}
}

package com.jdbl.wallet.transaction;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepo  extends JpaRepository<Transaction, Integer> {
	
	
	Transaction  findByTxnId(String txnId);

}

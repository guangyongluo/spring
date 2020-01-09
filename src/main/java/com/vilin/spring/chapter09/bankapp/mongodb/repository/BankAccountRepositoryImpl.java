package com.vilin.spring.chapter09.bankapp.mongodb.repository;

import com.vilin.spring.chapter09.bankapp.mongodb.domain.BankAccountDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;


public class BankAccountRepositoryImpl implements BankAccountRepositoryCustom {
	@Autowired
	private MongoOperations mongoOperations;
	
	@Override
	public void subtractFromAccount(String bankAccountId, int amount) {
		BankAccountDetails bankAccountDetails = mongoOperations.findById(bankAccountId, BankAccountDetails.class);
		if (bankAccountDetails.getBalance() < amount) {
			throw new RuntimeException("Insufficient balance amount in bank account");
		}
		bankAccountDetails.setBalance(bankAccountDetails.getBalance() - amount);
		mongoOperations.save(bankAccountDetails);
	}
}

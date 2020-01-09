package com.vilin.spring.chapter09.bankapp.springdata.jpa.repository;

import com.vilin.spring.chapter09.bankapp.springdata.jpa.domain.BankAccountDetails;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class BankAccountRepositoryImpl implements BankAccountRepositoryCustom {
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void subtractFromAccount(int bankAccountId, int amount) {
		BankAccountDetails bankAccountDetails = entityManager.find(BankAccountDetails.class, bankAccountId);
		if (bankAccountDetails.getBalanceAmount() < amount) {
			throw new RuntimeException("Insufficient balance amount in bank account");
		}
		bankAccountDetails.setBalanceAmount(bankAccountDetails.getBalanceAmount() - amount);
		entityManager.merge(bankAccountDetails);
	}
}

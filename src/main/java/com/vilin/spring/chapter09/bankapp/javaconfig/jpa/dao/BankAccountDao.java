package com.vilin.spring.chapter09.bankapp.javaconfig.jpa.dao;

import com.vilin.spring.chapter09.bankapp.javaconfig.jpa.domain.BankAccountDetails;

import java.util.List;

public interface BankAccountDao {
	int createBankAccount(BankAccountDetails bankAccountDetails);
	List<BankAccountDetails> findAccountsWithBalanceGreaterThan(int balanceAmount);
	void subtractFromAccount(int bankAccountId, int amount);
}

package com.vilin.spring.chapter09.bankapp.javaconfig.jpa.service;

import com.vilin.spring.chapter09.bankapp.javaconfig.jpa.domain.BankAccountDetails;

import java.util.List;

public interface BankAccountService {
	int createBankAccount(BankAccountDetails bankAccountDetails);

	List<BankAccountDetails> findAccountsWithBalanceGreaterThan(int balanceAmount);
}

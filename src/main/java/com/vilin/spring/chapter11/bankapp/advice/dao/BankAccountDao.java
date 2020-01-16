package com.vilin.spring.chapter11.bankapp.advice.dao;

import com.vilin.spring.chapter11.bankapp.advice.domain.BankAccountDetails;

public interface BankAccountDao {
	int createBankAccount(BankAccountDetails bankAccountDetails);
	void subtractFromAccount(int bankAccountId, int amount);
}

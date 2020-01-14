package com.vilin.spring.chapter11.bankapp.sample.dao;

import com.vilin.spring.chapter11.bankapp.sample.domain.BankAccountDetails;

public interface BankAccountDao {
	int createBankAccount(BankAccountDetails bankAccountDetails);
	void subtractFromAccount(int bankAccountId, int amount);
}

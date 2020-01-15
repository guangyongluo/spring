package com.vilin.spring.chapter11.bankapp.proxy.dao;

import com.vilin.spring.chapter11.bankapp.proxy.domain.BankAccountDetails;

public interface BankAccountDao {
	int createBankAccount(BankAccountDetails bankAccountDetails);
	void subtractFromAccount(int bankAccountId, int amount);
}

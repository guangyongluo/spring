package com.vilin.spring.chapter10.javaconfig.dao;

import com.vilin.spring.chapter10.javaconfig.domain.BankAccountDetails;

public interface BankAccountDao {
	int createBankAccount(BankAccountDetails bankAccountDetails);
	void subtractFromAccount(int bankAccountId, int amount);
}

package com.vilin.spring.chapter11.bankapp.pointcut.dao;

import com.vilin.spring.chapter11.bankapp.pointcut.domain.BankAccountDetails;

public interface BankAccountDao {
	int createBankAccount(BankAccountDetails bankAccountDetails);
	void subtractFromAccount(int bankAccountId, int amount);
}

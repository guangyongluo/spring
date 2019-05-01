package com.vilin.spring.chapter08.bankapp.spring.hibernate.dao;

import com.vilin.spring.chapter08.bankapp.spring.hibernate.domain.BankAccountDetails;

public interface BankAccountDao {
	int createBankAccount(BankAccountDetails bankAccountDetails);
	void subtractFromAccount(int bankAccountId, int amount);
}

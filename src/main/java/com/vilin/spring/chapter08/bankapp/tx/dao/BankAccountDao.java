package com.vilin.spring.chapter08.bankapp.tx.dao;

import com.vilin.spring.chapter08.bankapp.tx.domain.BankAccountDetails;

public interface BankAccountDao {
	int createBankAccount(BankAccountDetails bankAccountDetails);
	void subtractFromAccount(int bankAccountId, int amount);
}

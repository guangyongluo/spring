package com.vilin.spring.chapter08.bankapp.jdbc.dao;

import com.vilin.spring.chapter08.bankapp.jdbc.domain.BankAccountDetails;

public interface BankAccountDao {
	int createBankAccount(BankAccountDetails bankAccountDetails);
	void subtractFromAccount(int bankAccountId, int amount);
}

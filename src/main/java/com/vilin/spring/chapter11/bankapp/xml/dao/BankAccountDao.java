package com.vilin.spring.chapter11.bankapp.xml.dao;

import com.vilin.spring.chapter11.bankapp.xml.domain.BankAccountDetails;

public interface BankAccountDao {
	int createBankAccount(BankAccountDetails bankAccountDetails);
	void subtractFromAccount(int bankAccountId, int amount);
}

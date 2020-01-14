package com.vilin.spring.chapter10.bankapp.dao;


import com.vilin.spring.chapter10.bankapp.domain.BankAccountDetails;

public interface BankAccountDao {
	int createBankAccount(BankAccountDetails bankAccountDetails);
	void subtractFromAccount(int bankAccountId, int amount);
}

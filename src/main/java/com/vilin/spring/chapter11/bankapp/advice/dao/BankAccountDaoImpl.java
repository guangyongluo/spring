package com.vilin.spring.chapter11.bankapp.advice.dao;

import com.vilin.spring.chapter11.bankapp.advice.domain.BankAccountDetails;
import org.springframework.stereotype.Repository;

@Repository(value = "bankAccountDao")
public class BankAccountDaoImpl implements BankAccountDao {

	@Override
	public int createBankAccount(final BankAccountDetails bankAccountDetails) {
		
		//--create account and return it's primary key.
		return 1;
	}

	public void subtractFromAccount(int bankAccountId, int amount) {
		//-- subtract fixed deposit amount from bank account
	}
}

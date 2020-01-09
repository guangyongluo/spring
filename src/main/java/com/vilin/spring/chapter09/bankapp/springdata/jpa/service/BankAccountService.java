package com.vilin.spring.chapter09.bankapp.springdata.jpa.service;

import com.vilin.spring.chapter09.bankapp.springdata.jpa.domain.BankAccountDetails;

public interface BankAccountService {
	int createBankAccount(BankAccountDetails bankAccountDetails);
}

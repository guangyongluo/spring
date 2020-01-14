package com.vilin.spring.chapter11.bankapp.sample.service;

import com.vilin.spring.chapter11.bankapp.sample.domain.BankAccountDetails;

public interface BankAccountService {
	int createBankAccount(BankAccountDetails bankAccountDetails);
}

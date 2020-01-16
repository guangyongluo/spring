package com.vilin.spring.chapter11.bankapp.advice.service;

import com.vilin.spring.chapter11.bankapp.advice.domain.BankAccountDetails;

public interface BankAccountService {
	int createBankAccount(BankAccountDetails bankAccountDetails);
}

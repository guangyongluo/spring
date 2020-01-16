package com.vilin.spring.chapter11.bankapp.pointcut.service;

import com.vilin.spring.chapter11.bankapp.pointcut.domain.BankAccountDetails;

public interface BankAccountService {
	int createBankAccount(BankAccountDetails bankAccountDetails);
}

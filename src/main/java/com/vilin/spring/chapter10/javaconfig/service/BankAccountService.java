package com.vilin.spring.chapter10.javaconfig.service;

import com.vilin.spring.chapter10.javaconfig.domain.BankAccountDetails;

public interface BankAccountService {
	int createBankAccount(BankAccountDetails bankAccountDetails);
}

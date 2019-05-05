package com.vilin.spring.chapter08.bankapp.javaconfig.hibernate.service;

import com.vilin.spring.chapter08.bankapp.javaconfig.hibernate.domain.BankAccountDetails;

public interface BankAccountService {
	int createBankAccount(BankAccountDetails bankAccountDetails);
}

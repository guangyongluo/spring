package com.vilin.spring.chapter08.bankapp.jdbc.service;

import com.vilin.spring.chapter08.bankapp.jdbc.domain.BankAccountDetails;

public interface BankAccountService {
	int createBankAccount(BankAccountDetails bankAccountDetails);
}

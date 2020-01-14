package com.vilin.spring.chapter10.bankapp.service;

import com.vilin.spring.chapter10.bankapp.domain.BankAccountDetails;

public interface BankAccountService {
	int createBankAccount(BankAccountDetails bankAccountDetails);
}

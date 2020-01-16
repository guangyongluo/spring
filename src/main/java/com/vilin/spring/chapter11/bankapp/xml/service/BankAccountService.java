package com.vilin.spring.chapter11.bankapp.xml.service;

import com.vilin.spring.chapter11.bankapp.xml.domain.BankAccountDetails;

public interface BankAccountService {
	int createBankAccount(BankAccountDetails bankAccountDetails);
}

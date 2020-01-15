package com.vilin.spring.chapter11.bankapp.proxy.service;


import com.vilin.spring.chapter11.bankapp.proxy.domain.BankAccountDetails;

public interface BankAccountService {
	int createBankAccount(BankAccountDetails bankAccountDetails);
	boolean isDuplicateAccount(BankAccountDetails bankAccountDetails);
}

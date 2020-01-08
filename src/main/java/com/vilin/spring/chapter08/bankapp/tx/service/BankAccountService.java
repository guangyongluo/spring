package com.vilin.spring.chapter08.bankapp.tx.service;


import com.vilin.spring.chapter08.bankapp.tx.domain.BankAccountDetails;

public interface BankAccountService {
	int createBankAccount(BankAccountDetails bankAccountDetails);
}

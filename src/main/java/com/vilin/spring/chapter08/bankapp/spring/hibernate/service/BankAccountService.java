package com.vilin.spring.chapter08.bankapp.spring.hibernate.service;


import com.vilin.spring.chapter08.bankapp.spring.hibernate.domain.BankAccountDetails;

public interface BankAccountService {
	int createBankAccount(BankAccountDetails bankAccountDetails);
}

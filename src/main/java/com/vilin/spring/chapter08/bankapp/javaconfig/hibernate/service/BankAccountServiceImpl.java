package com.vilin.spring.chapter08.bankapp.javaconfig.hibernate.service;

import com.vilin.spring.chapter08.bankapp.javaconfig.hibernate.dao.BankAccountDao;
import com.vilin.spring.chapter08.bankapp.javaconfig.hibernate.domain.BankAccountDetails;
import org.springframework.transaction.annotation.Transactional;

public class BankAccountServiceImpl implements BankAccountService {

	private BankAccountDao bankAccountDao;

	public void setBankAccountDao(BankAccountDao bankAccountDao) {
		this.bankAccountDao = bankAccountDao;
	}
	
	@Override
	@Transactional
	public int createBankAccount(BankAccountDetails bankAccountDetails) {
		return bankAccountDao.createBankAccount(bankAccountDetails);
	}

}

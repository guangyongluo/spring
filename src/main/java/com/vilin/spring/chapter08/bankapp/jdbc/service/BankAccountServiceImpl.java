package com.vilin.spring.chapter08.bankapp.jdbc.service;

import com.vilin.spring.chapter08.bankapp.jdbc.dao.BankAccountDao;
import com.vilin.spring.chapter08.bankapp.jdbc.domain.BankAccountDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "bankAccountService")
public class BankAccountServiceImpl implements BankAccountService {

	@Autowired
	private BankAccountDao bankAccountDao;

	@Override
	public int createBankAccount(BankAccountDetails bankAccountDetails) {
		return bankAccountDao.createBankAccount(bankAccountDetails);
	}

}

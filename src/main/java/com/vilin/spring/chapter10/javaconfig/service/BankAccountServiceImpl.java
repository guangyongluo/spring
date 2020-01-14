package com.vilin.spring.chapter10.javaconfig.service;

import com.vilin.spring.chapter10.javaconfig.dao.BankAccountDao;
import com.vilin.spring.chapter10.javaconfig.domain.BankAccountDetails;
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

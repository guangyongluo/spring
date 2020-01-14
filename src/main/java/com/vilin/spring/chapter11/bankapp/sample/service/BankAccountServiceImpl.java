package com.vilin.spring.chapter11.bankapp.sample.service;

import com.vilin.spring.chapter11.bankapp.sample.dao.BankAccountDao;
import com.vilin.spring.chapter11.bankapp.sample.domain.BankAccountDetails;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "bankAccountService")
public class BankAccountServiceImpl implements BankAccountService {
	private static Logger logger = LogManager.getLogger(BankAccountServiceImpl.class);
	@Autowired
	private BankAccountDao bankAccountDao;

	@Override
	public int createBankAccount(BankAccountDetails bankAccountDetails) {
		logger.info("createBankAccount method invoked");
		return bankAccountDao.createBankAccount(bankAccountDetails);
	}
}

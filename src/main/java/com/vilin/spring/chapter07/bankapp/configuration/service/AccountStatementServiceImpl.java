package com.vilin.spring.chapter07.bankapp.configuration.service;

import com.vilin.spring.chapter07.bankapp.configuration.dao.AccountStatementDao;
import com.vilin.spring.chapter07.bankapp.configuration.domain.AccountStatement;

import java.util.Date;

public class AccountStatementServiceImpl implements AccountStatementService {
	private AccountStatementDao accountStatementDao;

	public void setAccountStatementDao(AccountStatementDao accountStatementDao) {
		this.accountStatementDao = accountStatementDao;
	}

	@Override
	public AccountStatement getAccountStatement(Date from, Date to) {
		return accountStatementDao.getAccountStatement(from, to);
	}
}

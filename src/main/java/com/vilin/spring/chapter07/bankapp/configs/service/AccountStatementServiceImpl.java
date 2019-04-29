package com.vilin.spring.chapter07.bankapp.configs.service;

import com.vilin.spring.chapter07.bankapp.configs.dao.AccountStatementDao;
import com.vilin.spring.chapter07.bankapp.configs.domain.AccountStatement;
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

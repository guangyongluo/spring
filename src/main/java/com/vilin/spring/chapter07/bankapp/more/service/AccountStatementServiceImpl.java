package com.vilin.spring.chapter07.bankapp.more.service;

import com.vilin.spring.chapter07.bankapp.more.dao.AccountStatementDao;
import com.vilin.spring.chapter07.bankapp.more.domain.AccountStatement;

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

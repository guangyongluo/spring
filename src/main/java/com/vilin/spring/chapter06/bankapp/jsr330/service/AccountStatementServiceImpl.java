package com.vilin.spring.chapter06.bankapp.jsr330.service;

import com.vilin.spring.chapter06.bankapp.jsr330.dao.AccountStatementDao;
import com.vilin.spring.chapter06.bankapp.jsr330.domain.AccountStatement;

import java.util.Date;

import javax.inject.Inject;
import javax.inject.Named;

@Named(value="accountStatementService")
public class AccountStatementServiceImpl implements AccountStatementService {
	@Inject
	private AccountStatementDao accountStatementDao;
	
	@Override
	public AccountStatement getAccountStatement(Date from, Date to) {
		return accountStatementDao.getAccountStatement(from, to);
	}
}

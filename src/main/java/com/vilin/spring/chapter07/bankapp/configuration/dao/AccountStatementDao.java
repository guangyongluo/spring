package com.vilin.spring.chapter07.bankapp.configuration.dao;

import com.vilin.spring.chapter07.bankapp.configuration.domain.AccountStatement;

import java.util.Date;

public interface AccountStatementDao {
	public AccountStatement getAccountStatement(Date from, Date to);
}

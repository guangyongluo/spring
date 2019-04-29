package com.vilin.spring.chapter07.bankapp.configs.dao;

import com.vilin.spring.chapter07.bankapp.configs.domain.AccountStatement;

import java.util.Date;

public interface AccountStatementDao {
	public AccountStatement getAccountStatement(Date from, Date to);
}

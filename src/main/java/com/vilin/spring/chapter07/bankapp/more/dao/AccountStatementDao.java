package com.vilin.spring.chapter07.bankapp.more.dao;

import com.vilin.spring.chapter07.bankapp.more.domain.AccountStatement;

import java.util.Date;

public interface AccountStatementDao {
	public AccountStatement getAccountStatement(Date from, Date to);
}

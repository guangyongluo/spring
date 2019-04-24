package com.vilin.spring.chapter04.bankapp.autowiring.dao;

import com.vilin.spring.chapter04.bankapp.autowiring.domain.AccountStatement;

import java.util.Date;

public interface AccountStatementDao {
	public AccountStatement getAccountStatement(Date from, Date to);
}

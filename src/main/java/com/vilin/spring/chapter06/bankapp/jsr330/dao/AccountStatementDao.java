package com.vilin.spring.chapter06.bankapp.jsr330.dao;

import com.vilin.spring.chapter06.bankapp.jsr330.domain.AccountStatement;

import java.util.Date;


public interface AccountStatementDao {
	public AccountStatement getAccountStatement(Date from, Date to);
}

package com.vilin.spring.chapter06.bankapp.annotations.dao;

import com.vilin.spring.chapter06.bankapp.annotations.domain.AccountStatement;

import java.util.Date;

public interface AccountStatementDao {
	public AccountStatement getAccountStatement(Date from, Date to);
}

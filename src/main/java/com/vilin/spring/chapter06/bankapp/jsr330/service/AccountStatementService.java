package com.vilin.spring.chapter06.bankapp.jsr330.service;

import com.vilin.spring.chapter06.bankapp.jsr330.domain.AccountStatement;

import java.util.Date;

public interface AccountStatementService {
	public AccountStatement getAccountStatement(Date from, Date to);
}

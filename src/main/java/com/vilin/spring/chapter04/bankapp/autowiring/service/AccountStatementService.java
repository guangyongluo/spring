package com.vilin.spring.chapter04.bankapp.autowiring.service;

import com.vilin.spring.chapter04.bankapp.autowiring.domain.AccountStatement;

import java.util.Date;

public interface AccountStatementService {
	public AccountStatement getAccountStatement(Date from, Date to);
}

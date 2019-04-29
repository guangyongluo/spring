package com.vilin.spring.chapter07.bankapp.configuration.service;

import com.vilin.spring.chapter07.bankapp.configuration.domain.AccountStatement;

import java.util.Date;

public interface AccountStatementService {
	AccountStatement getAccountStatement(Date from, Date to);
}

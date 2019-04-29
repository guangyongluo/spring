package com.vilin.spring.chapter07.bankapp.configs.service;

import com.vilin.spring.chapter07.bankapp.configs.domain.AccountStatement;

import java.util.Date;

public interface AccountStatementService {
	AccountStatement getAccountStatement(Date from, Date to);
}

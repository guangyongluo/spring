package com.vilin.spring.chapter06.bankapp.annotations.service;

import com.vilin.spring.chapter06.bankapp.annotations.domain.AccountStatement;

import java.util.Date;

public interface AccountStatementService extends MyService {
	AccountStatement getAccountStatement(Date from, Date to);
}

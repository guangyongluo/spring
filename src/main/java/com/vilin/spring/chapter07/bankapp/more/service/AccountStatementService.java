package com.vilin.spring.chapter07.bankapp.more.service;

import com.vilin.spring.chapter07.bankapp.more.domain.AccountStatement;

import java.util.Date;

public interface AccountStatementService { AccountStatement getAccountStatement(Date from, Date to);
}

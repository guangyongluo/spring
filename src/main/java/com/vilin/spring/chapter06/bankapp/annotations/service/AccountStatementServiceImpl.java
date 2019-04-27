package com.vilin.spring.chapter06.bankapp.annotations.service;

import java.util.Date;

import com.vilin.spring.chapter06.bankapp.annotations.dao.AccountStatementDao;
import com.vilin.spring.chapter06.bankapp.annotations.domain.AccountStatement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service(value="accountStatementService")
@Qualifier("service")
public class AccountStatementServiceImpl implements AccountStatementService {
	@Autowired 
	private AccountStatementDao accountStatementDao;
	
	@Override
	public AccountStatement getAccountStatement(Date from, Date to) {
		return accountStatementDao.getAccountStatement(from, to);
	}
}

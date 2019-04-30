package com.vilin.spring.chapter07.bankapp.more.hibernate.dao;

import com.vilin.spring.chapter07.bankapp.more.dao.AccountStatementDao;
import com.vilin.spring.chapter07.bankapp.more.domain.AccountStatement;
import com.vilin.spring.chapter07.bankapp.more.domain.DataSource;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Date;

public class AccountStatementHibernateDaoImpl implements AccountStatementDao {
	private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

	public AccountStatementHibernateDaoImpl(DataSource dataSource) {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public AccountStatement getAccountStatement(Date from, Date to) {
		logger.info("Getting account statement");
		return new AccountStatement();
	}

}

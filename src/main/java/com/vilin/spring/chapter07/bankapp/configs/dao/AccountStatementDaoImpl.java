package com.vilin.spring.chapter07.bankapp.configs.dao;

import com.vilin.spring.chapter07.bankapp.configs.domain.AccountStatement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Date;

public class AccountStatementDaoImpl implements AccountStatementDao {
	private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

	@Override
	public AccountStatement getAccountStatement(Date from, Date to) {
		logger.info("Getting account statement");
		return new AccountStatement();
	}

}

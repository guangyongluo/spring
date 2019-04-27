package com.vilin.spring.chapter06.bankapp.annotations.dao;

import java.util.Date;

import com.vilin.spring.chapter06.bankapp.annotations.domain.AccountStatement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

@Repository(value="accountStatementDao")
public class AccountStatementDaoImpl implements AccountStatementDao {
	private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

	public AccountStatementDaoImpl(){logger.info("Created AccountStatementDaoImpl");}

	@Override
	public AccountStatement getAccountStatement(Date from, Date to) {
		logger.info("Getting account statement");
		return new AccountStatement();
	}

}

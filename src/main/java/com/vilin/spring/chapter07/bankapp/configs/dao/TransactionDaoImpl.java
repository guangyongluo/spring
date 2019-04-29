package com.vilin.spring.chapter07.bankapp.configs.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TransactionDaoImpl implements TransactionDao {
	private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
	
	@Override
	public void getTransactions(String customerId) {
		logger.info("Getting transactions");
	}
}

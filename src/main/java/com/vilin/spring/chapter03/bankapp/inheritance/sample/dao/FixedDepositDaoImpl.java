package com.vilin.spring.chapter03.bankapp.inheritance.sample.dao;

import com.vilin.spring.chapter03.bankapp.inheritance.sample.domain.FixedDepositDetails;
import com.vilin.spring.chapter03.bankapp.inheritance.sample.utils.DatabaseOperations;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FixedDepositDaoImpl implements FixedDepositDao {
	private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
	private DatabaseOperations databaseOperations;
	
	public void setDatabaseOperations(DatabaseOperations databaseOperations) {
		this.databaseOperations = databaseOperations;
	}
	
	public FixedDepositDaoImpl() {
		logger.info("initializing");
	}

	public FixedDepositDetails getFixedDepositDetails(long id) {
		return databaseOperations.loadFd(id);
	}

	public boolean createFixedDeposit(FixedDepositDetails fdd) {
		return databaseOperations.saveFd(fdd);
	}
}

package com.vilin.spring.chapter07.bankapp.profile.dao;


import com.vilin.spring.chapter07.bankapp.profile.domain.DataSource;
import com.vilin.spring.chapter07.bankapp.profile.domain.FixedDepositDetails;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class FixedDepositHibernateDao implements FixedDepositDao {
	private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
	
	@SuppressWarnings("unused")
	private DataSource dataSource;
	private Map<Long, FixedDepositDetails> fixedDeposits = new HashMap<Long, FixedDepositDetails>();

	public FixedDepositHibernateDao(DataSource dataSource) {
		this.dataSource = dataSource;
		logger.info("initializing");
	}

	public FixedDepositDetails getFixedDepositDetails(long id) {
		return fixedDeposits.get(id);
	}

	public boolean createFixedDeposit(FixedDepositDetails fdd) {
		fixedDeposits.put(fdd.getId(), fdd);
		return true;
	}
}

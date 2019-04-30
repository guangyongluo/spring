package com.vilin.spring.chapter07.bankapp.more.hibernate.dao;

import com.vilin.spring.chapter07.bankapp.more.dao.FixedDepositDao;
import com.vilin.spring.chapter07.bankapp.more.domain.DataSource;
import com.vilin.spring.chapter07.bankapp.more.domain.FixedDepositDetails;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FixedDepositHibernateDaoImpl implements FixedDepositDao {
	private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
	
	public FixedDepositHibernateDaoImpl(DataSource dataSource) {
		// TODO Auto-generated constructor stub
	}
	
	public boolean createFixedDeposit(FixedDepositDetails fdd) {
		// -- save the fixed deposits and then return true
		logger.info("Saving fixed deposit details");
		return true;
	}
}

package com.vilin.spring.chapter05.bankapp.beanpostprocessor.service;

import com.vilin.spring.chapter05.bankapp.beanpostprocessor.common.DependencyResolver;
import com.vilin.spring.chapter05.bankapp.beanpostprocessor.common.MyApplicationContext;
import com.vilin.spring.chapter05.bankapp.beanpostprocessor.dao.FixedDepositDao;
import com.vilin.spring.chapter05.bankapp.beanpostprocessor.domain.FixedDepositDetails;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FixedDepositServiceImpl implements FixedDepositService, DependencyResolver {
	private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
	private FixedDepositDao fixedDepositDao;
	
	@Override
	public void createFixedDeposit(FixedDepositDetails fdd) throws Exception {
		// -- create fixed deposit
		fixedDepositDao.createFixedDeposit(fdd);
	}

	@Override
	public void resolveDependency(MyApplicationContext myApplicationContext) {
		logger.info("Resolving dependencies of FixedDepositServiceImpl instance");
		fixedDepositDao = myApplicationContext.getBean(FixedDepositDao.class);
	}
}

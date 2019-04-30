package com.vilin.spring.chapter07.bankapp.profile;

import com.vilin.spring.chapter07.bankapp.profile.controller.FixedDepositController;
import com.vilin.spring.chapter07.bankapp.profile.controller.FixedDepositControllerImpl;
import com.vilin.spring.chapter07.bankapp.profile.dao.FixedDepositDao;
import com.vilin.spring.chapter07.bankapp.profile.dao.FixedDepositHibernateDao;
import com.vilin.spring.chapter07.bankapp.profile.dao.FixedDepositMyBatisDao;
import com.vilin.spring.chapter07.bankapp.profile.domain.DataSource;
import com.vilin.spring.chapter07.bankapp.profile.service.FixedDepositService;
import com.vilin.spring.chapter07.bankapp.profile.service.FixedDepositServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class BankAppConfiguration {
	private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
	
	@Bean
	public FixedDepositController fixedDepositController(FixedDepositService fixedDepositService) {
		FixedDepositControllerImpl controller = new FixedDepositControllerImpl();
		controller.setFixedDepositService(fixedDepositService);
		return controller;
	}

	@Bean
	@Profile({ "hibernate", "default" })
	public FixedDepositDao fixedDepositHibernateDao(DataSource dataSource) {
		logger.info("creating FixedDepositHibernateDao. Database URL is - " + dataSource.getUrl());
		return new FixedDepositHibernateDao(dataSource);
	}

	@Bean
	@Profile({ "mybatis" })
	public FixedDepositDao fixedDepositMyBatisDao(DataSource dataSource) {
		logger.info("creating FixedDepositMyBatisDao. Database URL is - " + dataSource.getUrl());
		return new FixedDepositMyBatisDao(dataSource);
	}

	@Bean
	public FixedDepositService fixedDepositService(FixedDepositDao fixedDepositDao) {
		FixedDepositServiceImpl service = new FixedDepositServiceImpl();
		service.setFixedDepositDao(fixedDepositDao);
		return service;
	}
}

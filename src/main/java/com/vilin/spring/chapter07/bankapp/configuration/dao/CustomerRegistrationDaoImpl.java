package com.vilin.spring.chapter07.bankapp.configuration.dao;


import com.vilin.spring.chapter07.bankapp.configuration.domain.CustomerRegistrationDetails;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomerRegistrationDaoImpl implements CustomerRegistrationDao {
	private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

	@Override
	public void registerCustomer(CustomerRegistrationDetails customerRegistrationDetails) {
		logger.info("Registering customer");
	}
}

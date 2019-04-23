package com.vilin.spring.chapter04.bankapp.dependencies.dao;

import com.vilin.spring.chapter04.bankapp.dependencies.domain.CustomerRequestDetails;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomerRequestDaoImpl implements CustomerRequestDao {
	private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
	
	public CustomerRequestDaoImpl() {
		logger.info("Created CustomerRequestDaoImpl instance");
	}
	
	@Override
	public void submitRequest(CustomerRequestDetails userRequestDetails) {
		// --save UserRequestDetails
	}

}

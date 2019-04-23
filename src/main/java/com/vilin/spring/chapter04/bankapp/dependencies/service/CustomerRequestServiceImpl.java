package com.vilin.spring.chapter04.bankapp.dependencies.service;

import com.vilin.spring.chapter04.bankapp.dependencies.dao.CustomerRequestDao;
import com.vilin.spring.chapter04.bankapp.dependencies.domain.CustomerRequestDetails;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.beans.ConstructorProperties;

@SuppressWarnings("unused")
public class CustomerRequestServiceImpl implements CustomerRequestService {
	private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
	private CustomerRequestDetails customerRequestDetails;
	private CustomerRequestDao customerRequestDao;

	@ConstructorProperties({ "customerRequestDetails", "customerRequestDao" })
	public CustomerRequestServiceImpl(
			CustomerRequestDetails customerRequestDetails,
			CustomerRequestDao customerRequestDao) {
		logger.info("Created CustomerRequestServiceImpl instance");
		this.customerRequestDetails = customerRequestDetails;
		this.customerRequestDao = customerRequestDao;
	}

	@Override
	public void submitRequest(String requestType, String requestDescription) {
		// -- create an instance of UserRequestDetails and save it
	}

}

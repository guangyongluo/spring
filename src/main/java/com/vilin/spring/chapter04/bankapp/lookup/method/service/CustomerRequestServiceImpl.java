package com.vilin.spring.chapter04.bankapp.lookup.method.service;

import com.vilin.spring.chapter04.bankapp.lookup.method.dao.CustomerRequestDao;
import com.vilin.spring.chapter04.bankapp.lookup.method.domain.CustomerRequestDetails;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.beans.ConstructorProperties;


public abstract class CustomerRequestServiceImpl implements CustomerRequestService {
	private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
	private CustomerRequestDao customerRequestDao;

	@ConstructorProperties({ "customerRequestDao" })
	public CustomerRequestServiceImpl(CustomerRequestDao customerRequestDao) {
		logger.info("Created CustomerRequestServiceImpl instance");
		this.customerRequestDao = customerRequestDao;
	}

	public abstract CustomerRequestDetails getCustomerRequestDetails();

	@Override
	public void submitRequest(String requestType, String requestDescription) {
		// -- populate CustomerRequestDetails object and save it
		CustomerRequestDetails customerRequestDetails = getCustomerRequestDetails();
		customerRequestDetails.setType(requestType);
		customerRequestDetails.setDescription(requestDescription);
		customerRequestDao.submitRequest(customerRequestDetails);
	}
}

package com.vilin.spring.chapter04.bankapp.context.aware.service;

import java.beans.ConstructorProperties;

import com.vilin.spring.chapter04.bankapp.context.aware.dao.CustomerRequestDao;
import com.vilin.spring.chapter04.bankapp.context.aware.domain.CustomerRequestDetails;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


public class CustomerRequestServiceImpl implements CustomerRequestService, ApplicationContextAware {
	private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
	private CustomerRequestDao customerRequestDao;
	private ApplicationContext applicationContext;

	@ConstructorProperties({ "customerRequestDao" })
	public CustomerRequestServiceImpl(
			CustomerRequestDao customerRequestDao) {
		logger.info("Created CustomerRequestServiceContextAwareImpl instance");
		this.customerRequestDao = customerRequestDao;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.applicationContext = applicationContext;
	}

	@Override
	public void submitRequest(String requestType, String requestDescription) {
		// -- populate CustomerRequestDetails object and save it
		CustomerRequestDetails customerRequestDetails = applicationContext.getBean(CustomerRequestDetails.class);
		customerRequestDetails.setType(requestType);
		customerRequestDetails.setDescription(requestDescription);
		customerRequestDao.submitRequest(customerRequestDetails);
	}

}

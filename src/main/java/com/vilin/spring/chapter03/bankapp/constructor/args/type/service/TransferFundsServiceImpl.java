package com.vilin.spring.chapter03.bankapp.constructor.args.type.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SuppressWarnings("unused")
public class TransferFundsServiceImpl implements TransferFundsService {
	private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

	private String webServiceUrl;
	private boolean active;
	private long timeout;
	private int numberOfRetrialAttempts;

	public TransferFundsServiceImpl(String webServiceUrl, boolean active, long timeout,
			int numberOfRetrialAttempts) {
		this.webServiceUrl = webServiceUrl;
		this.active = active;
		this.timeout = timeout;
		this.numberOfRetrialAttempts = numberOfRetrialAttempts;

		logger.info("Web Service URL: " + webServiceUrl + ", active : " + active + ", timeout : "
				+ timeout + ", numberOfRetrialAttempts "
				+ numberOfRetrialAttempts);
	}

	public void transferFunds() {

	}
}

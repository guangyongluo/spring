package com.vilin.spring.chapter07.bankapp.configuration;

import com.vilin.spring.chapter07.bankapp.configuration.service.TransactionService;
import com.vilin.spring.chapter07.bankapp.configuration.service.TransactionServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BankAppMixed {
	private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

	public static void main(String args[]) throws Exception {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BankAppConfiguration.class, TransactionServiceImpl.class);
		logger.info("----------> Beginning with accessing TransactionService");
		TransactionService transasctionService = context.getBean(TransactionService.class);
		transasctionService.getTransactions("someCustomerId");
		logger.info("----------> Done with accessing TransactionService");

		context.close();
	}
}
package com.vilin.spring.chapter07.bankapp.configs;

import java.util.Date;

import com.vilin.spring.chapter07.bankapp.configs.domain.FixedDepositDetails;
import com.vilin.spring.chapter07.bankapp.configs.service.AccountStatementService;
import com.vilin.spring.chapter07.bankapp.configs.service.CustomerRegistrationService;
import com.vilin.spring.chapter07.bankapp.configs.service.FixedDepositService;
import com.vilin.spring.chapter07.bankapp.configs.service.TransactionService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BankApp {
	private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

	public static void main(String args[]) throws Exception {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BankServicesConfig.class);

		logger.info("----------> Beginning with accessing CustomerRegistrationService");
		CustomerRegistrationService customerRegistrationService_1 = (CustomerRegistrationService) context
				.getBean("customerRegistrationService");
		customerRegistrationService_1.setAccountNumber("account_1");
		customerRegistrationService_1.setAddress("address_1");
		customerRegistrationService_1.setDebitCardNumber("debitCardNumber_1");
		customerRegistrationService_1.register();
		logger.info("----------> Done with accessing CustomerRegistrationService");

		logger.info("----------> Beginning with accessing FixedDepositService");
		FixedDepositService fixedDepositService = context.getBean(FixedDepositService.class);
		fixedDepositService.createFixedDeposit(new FixedDepositDetails(1, 1000, 12, "someemail@somedomain.com"));
		logger.info("----------> Done with accessing FixedDepositService");

		logger.info("----------> Beginning with accessing AccountStatementService");
		try {
			AccountStatementService accountStatementService = context.getBean(AccountStatementService.class);
			accountStatementService.getAccountStatement(new Date(), new Date());
		} catch (Exception e) {
			logger.error("Exception : " + e.toString());
		}
		logger.info("----------> Done with accessing AccountStatementService");

		logger.info("----------> Beginning with accessing TransactionService");
		TransactionService transasctionService = context.getBean(TransactionService.class);
		transasctionService.getTransactions("someCustomerId");
		logger.info("----------> Done with accessing TransactionService");

		context.close();
	}
}
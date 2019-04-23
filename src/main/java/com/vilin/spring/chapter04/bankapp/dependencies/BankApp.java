package com.vilin.spring.chapter04.bankapp.dependencies;

import com.vilin.spring.chapter04.bankapp.dependencies.domain.FixedDepositDetails;
import com.vilin.spring.chapter04.bankapp.dependencies.service.CustomerRegistrationService;
import com.vilin.spring.chapter04.bankapp.dependencies.service.CustomerRequestService;
import com.vilin.spring.chapter04.bankapp.dependencies.service.FixedDepositService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankApp {
	private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

	public static void main(String args[]) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:com/vilin/spring/chapter04/bankapp/dependencies/spring/applicationContext.xml");

		FixedDepositService fixedDepositService = (FixedDepositService) context.getBean("service");

		fixedDepositService.createFixedDeposit(new FixedDepositDetails(101, 10000, 60, "someemail@somedomain.com"));

		logger.info("Beginning with accessing CustomerRequestService");
		CustomerRequestService customerRequestService_1 = context.getBean(CustomerRequestService.class);
		customerRequestService_1.submitRequest("checkBookRequest", "Request to send a 50-leaf check book");

		CustomerRequestService customerRequestService_2 = context.getBean(CustomerRequestService.class);
		customerRequestService_2.submitRequest("checkBookRequest", "Request to send a 100-leaf check book");
		logger.info("Done with accessing CustomerRequestService");

		logger.info("Beginning with accessing CustomerRegistrationService");

		CustomerRegistrationService customerRegistrationService_1 = context.getBean(CustomerRegistrationService.class);
		customerRegistrationService_1.setAccountNumber("account_1");
		customerRegistrationService_1.setAddress("address_1");
		customerRegistrationService_1.setDebitCardNumber("debitCardNumber_1");
		customerRegistrationService_1.register();
		
		logger.info("registered customer with id account_1");
		
		CustomerRegistrationService customerRegistrationService_2 = context.getBean(CustomerRegistrationService.class);
		customerRegistrationService_2.setAccountNumber("account_2");
		customerRegistrationService_2.setAddress("address_2");
		customerRegistrationService_2.setDebitCardNumber("debitCardNumber_2");
		customerRegistrationService_2.register();
		logger.info("registered customer with id account_2");
		
		logger.info("Done with accessing CustomerRegistrationService");
	}
}

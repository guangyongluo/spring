package com.vilin.spring.chapter07.bankapp.profile;

import com.vilin.spring.chapter07.bankapp.profile.controller.FixedDepositController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BankAppWithProfile {
	private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

	public static void main(String args[]) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.getEnvironment().setActiveProfiles("mybatis", "production");
		context.register(BankAppConfiguration.class, DevDBConfiguration.class, ProdDBConfiguration.class);
		context.refresh();
		
		FixedDepositController fixedDepositController = context.getBean(FixedDepositController.class);

		logger.info("Submission status of fixed deposit : " + fixedDepositController.submit());
		logger.info("Returned fixed deposit info : " + fixedDepositController.get());
		context.close();
	}
}

package com.vilin.spring.chapter03.bankapp.modular;

import com.vilin.spring.chapter03.bankapp.modular.controller.FixedDepositController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankApp {
	private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:com/vilin/spring/chapter03/bankapp/modular/bankapp-controller.xml");

		FixedDepositController fixedDepositController = (FixedDepositController) context.getBean("controller");

		logger.info("Submission status of fixed deposit : " + fixedDepositController.submit());
		logger.info("Returned fixed deposit info : " + fixedDepositController.get());
	}
}

package com.vilin.spring.chapter02.bankapp.scope;

import com.vilin.spring.chapter02.bankapp.scope.controller.FixedDepositController;
import com.vilin.spring.chapter02.bankapp.scope.domain.FixedDepositDetails;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class BankApp {
	private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:com/vilin/spring/chapter02/bankapp/scope/applicationContext.xml");
		
		FixedDepositController controller1 = (FixedDepositController) context
				.getBean("controller");
		FixedDepositController controller2 = (FixedDepositController) context
				.getBean("controller");

		FixedDepositDetails fixedDepositDetails1 = (FixedDepositDetails) context
				.getBean("fixedDepositDetails");
		FixedDepositDetails fixedDepositDetails2 = (FixedDepositDetails) context
				.getBean("fixedDepositDetails");

		if (controller1 == controller2) {
			logger.info("Same FixedDepositController instance");
		} else {
			logger.info("Different FixedDepositController instances");
		}
		if (fixedDepositDetails1 == fixedDepositDetails2) {
			logger.info("Same FixedDepositDetails instance");
		} else {
			logger.info("Different FixedDepositDetails instances");
		}
	}
}

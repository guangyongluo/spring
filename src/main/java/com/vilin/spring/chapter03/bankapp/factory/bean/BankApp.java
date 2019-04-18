package com.vilin.spring.chapter03.bankapp.factory.bean;

import com.vilin.spring.chapter03.bankapp.factory.bean.domain.FixedDepositDetails;
import com.vilin.spring.chapter03.bankapp.factory.bean.service.FixedDepositService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankApp {
	private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
	
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:com/vilin/spring/chapter03/bankapp/factory/bean/spring/applicationContext.xml");

		FixedDepositService fixedDepositService = (FixedDepositService) context.getBean("service");

		fixedDepositService.createFixedDeposit(new FixedDepositDetails(101, 10000, 60, "someemail@somedomain.com"));
		
		logger.info("Invoking getBean(\"eventFactory\") returns : " + context.getBean("eventSenderFactory"));
		logger.info("Invoking getBean(\"&eventFactory\") returns : " + context.getBean("&eventSenderFactory"));
	}
}

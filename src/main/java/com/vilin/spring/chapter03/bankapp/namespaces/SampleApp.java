package com.vilin.spring.chapter03.bankapp.namespaces;

import com.vilin.spring.chapter03.bankapp.namespaces.beans.BankDetails;
import com.vilin.spring.chapter03.bankapp.namespaces.beans.BankStatement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SampleApp {
	private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:com/vilin/spring/chapter03/bankapp/namespaces/applicationContext.xml");
		BankDetails bankDetails = context.getBean(BankDetails.class);
		logger.info(bankDetails);
		
		BankStatement bankStatement = context.getBean(BankStatement.class);
		logger.info(bankStatement);
		
		logger.info("Created context successfully");
	}
}

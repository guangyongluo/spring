package com.vilin.spring.chapter06.bankapp.lazy.dependencies;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SampleApp {
	private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

	public static void main(String args[]) throws Exception {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("classpath:com/vilin/spring/chapter06/bankapp/lazy/dependencies/applicationContext.xml");
		MyServices services = context.getBean(MyServices.class);
		logger.info("Calling --> useStateless");
		services.useStateless();
		logger.info("Calling again --> useStateless");
		services.useStateless();
		logger.info("Calling --> useStateful");
		services.useStateful();
		logger.info("Calling again --> useStateful");
		services.useStateful();
		context.close();
	}
}

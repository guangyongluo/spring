package com.vilin.spring.chapter06.bankapp.spel.example;

import com.vilin.spring.chapter06.bankapp.spel.example.beans.Sample;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SampleApp {
	private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:com/vilin/spring/chapter06/bankapp/spel/example/applicationContext.xml");
		Sample sample = context.getBean(Sample.class);
		logger.info(sample);
	}
}

package com.vilin.spring.chapter06.bankapp.value.annotation;

import com.vilin.spring.chapter06.bankapp.value.annotation.beans.Sample;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SampleApp {
	private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

	public static void main(String args[]) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("classpath:com/vilin/spring/chapter06/bankapp/value/annotation/applicationContext.xml");
		Sample sample = context.getBean(Sample.class);
		logger.info("environment --> " + sample.getEnvironment());
		logger.info("currency --> " + sample.getCurrency());
		logger.info("country --> " + sample.getCountry());
		logger.info("state --> " + sample.getState());
		logger.info("city --> " + sample.getCity());
		logger.info("splitName --> " + sample.getSplitName()[0] + " " + sample.getSplitName()[1]);
		logger.info("Configuration bean reference --> " + sample.getMyConfigurationBean());
		logger.info("httpOrHttps --> " + sample.getHttpOrHttps());
		logger.info("isGreaterThan --> " + sample.isGreaterThan());
		logger.info("isConditionTrue --> " + sample.isConditionTrue());
		logger.info("totalAmount --> " + sample.getTotalAmount());
		logger.info("listItem --> " + sample.getListItem());
		logger.info("mapItem --> " + sample.getMapItem());
		logger.info("isEmailId --> " + sample.isEmailId());
		context.close();
	}
}

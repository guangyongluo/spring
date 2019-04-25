package com.vilin.spring.chapter05.bankapp.beanpostprocessor.factory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

public class EventSenderFactoryBean implements FactoryBean<EventSender>,
		InitializingBean {
	private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

	public EventSenderFactoryBean() {
		logger.info("Created EventSenderFactoryBean");
	}

	@Override
	public EventSender getObject() throws Exception {
		logger.info("getObject method of EventSenderFactoryBean invoked");
		return new EventSender();
	}

	@Override
	public Class<?> getObjectType() {
		return EventSender.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		logger.info("afterPropertiesSet method of EventSenderFactoryBean invoked");
	}

}

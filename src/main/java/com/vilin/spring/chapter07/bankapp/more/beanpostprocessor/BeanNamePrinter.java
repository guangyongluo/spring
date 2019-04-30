package com.vilin.spring.chapter07.bankapp.more.beanpostprocessor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class BeanNamePrinter implements BeanFactoryPostProcessor {
    private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

	public BeanNamePrinter() {
		logger.info("Created BeanNamePrinter instance");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
		// -- get all the bean definitions
		for (int i = 0; i < beanDefinitionNames.length; i++) {
			String beanName = beanDefinitionNames[i];
			logger.info("Found bean named: " + beanName);
		}
	}
}

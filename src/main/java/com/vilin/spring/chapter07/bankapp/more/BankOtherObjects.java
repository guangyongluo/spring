package com.vilin.spring.chapter07.bankapp.more;

import com.vilin.spring.chapter07.bankapp.more.beanpostprocessor.BeanNamePrinter;
import com.vilin.spring.chapter07.bankapp.more.beanpostprocessor.MyBeanPostProcessor;
import com.vilin.spring.chapter07.bankapp.more.domain.CustomerRegistrationDetails;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class BankOtherObjects {
	@Bean(name = "customerRegistrationDetails")
	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public CustomerRegistrationDetails customerRegistrationDetails() {
		return new CustomerRegistrationDetails();
	}
	
	@Bean
	public static BeanNamePrinter beanNamePrinter() {
		return new BeanNamePrinter();
	}
	
	@Bean
	public static MyBeanPostProcessor myBeanPostProcessor() {
		return new MyBeanPostProcessor();
	}
}

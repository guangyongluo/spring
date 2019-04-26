package com.vilin.spring.chapter05.bankapp.beanfactorypostprocessor;

import com.vilin.spring.chapter05.bankapp.beanfactorypostprocessor.service.FixedDepositService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankApp {
	public static void main(String args[]) throws Exception {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("classpath:com/vilin/spring/chapter05/bankapp/beanfactorypostprocessor/applicationContext.xml");
		FixedDepositService fixedDepositService = context.getBean(FixedDepositService.class);
		fixedDepositService.createFixedDeposit(1, 1000, 12, "someemail@somedomain.com");
		context.close();
	}
}

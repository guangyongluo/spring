package com.vilin.spring.chapter05.bankapp.beanpostprocessor;

import com.vilin.spring.chapter05.bankapp.beanpostprocessor.domain.FixedDepositDetails;
import com.vilin.spring.chapter05.bankapp.beanpostprocessor.service.FixedDepositService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankApp {
	public static void main(String args[]) throws Exception {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("classpath:com/vilin/spring/chapter05/bankapp/beanpostprocessor/applicationContext.xml");
		FixedDepositService fixedDepositService = context.getBean(FixedDepositService.class);
		fixedDepositService.createFixedDeposit(new FixedDepositDetails(1, 1000, 12, "someemail@somedomain.com"));
		context.getBean("eventSenderFactory");
		context.getBean("eventSenderFactory");
		context.close();
	}
}

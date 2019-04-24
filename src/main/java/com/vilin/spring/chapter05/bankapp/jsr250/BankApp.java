package com.vilin.spring.chapter05.bankapp.jsr250;

import com.vilin.spring.chapter05.bankapp.jsr250.domain.FixedDepositDetails;
import com.vilin.spring.chapter05.bankapp.jsr250.service.FixedDepositService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class BankApp {
	public static void main(String args[]) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:com/vilin/spring/chapter05/bankapp/jsr250/applicationContext.xml");
		FixedDepositService fixedDepositService = context.getBean(FixedDepositService.class);
		fixedDepositService.createFixedDeposit(new FixedDepositDetails(1, 1000, 12, "someemail@somedomain.com"));
	}
}

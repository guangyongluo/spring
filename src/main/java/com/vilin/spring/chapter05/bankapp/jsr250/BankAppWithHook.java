package com.vilin.spring.chapter05.bankapp.jsr250;

import com.vilin.spring.chapter05.bankapp.jsr250.domain.FixedDepositDetails;
import com.vilin.spring.chapter05.bankapp.jsr250.service.FixedDepositService;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class BankAppWithHook {
	public static void main(String args[]) throws Exception {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("classpath:com/vilin/spring/chapter05/bankapp/jsr250/applicationContext.xml");
		context.registerShutdownHook();
		FixedDepositService fixedDepositService = context.getBean(FixedDepositService.class);
		fixedDepositService.createFixedDeposit(new FixedDepositDetails(1, 1000, 12, "someemail@somedomain.com"));
	}
}

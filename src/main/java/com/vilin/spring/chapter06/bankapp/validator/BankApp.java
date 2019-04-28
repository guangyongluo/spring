package com.vilin.spring.chapter06.bankapp.validator;

import com.vilin.spring.chapter06.bankapp.validator.domain.FixedDepositDetails;
import com.vilin.spring.chapter06.bankapp.validator.service.FixedDepositService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankApp {
	public static void main(String args[]) throws Exception {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("classpath:com/vilin/spring/chapter06/bankapp/validator/applicationContext.xml");

		FixedDepositService fixedDepositService = context.getBean(FixedDepositService.class);
		fixedDepositService.createFixedDeposit(new FixedDepositDetails(1, 0, 12, "someemail@somedomain.com"));
		fixedDepositService.createFixedDeposit(new FixedDepositDetails(1, 1000, 12, "someemail@somedomain.com"));
		context.close();
	}
}

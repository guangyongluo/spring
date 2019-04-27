package com.vilin.spring.chapter06.bankapp.custom.qualifier;

import com.vilin.spring.chapter06.bankapp.custom.qualifier.service.FundTransferProcessor;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class BankApp {
	public static void main(String args[]) throws Exception {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("classpath:com/vilin/spring/chapter06/bankapp/custom/qualifier/applicationContext.xml");
		context.getBean(FundTransferProcessor.class).sameBankImmediateFundTransferService();
		context.getBean(FundTransferProcessor.class).diffBankImmediateFundTransferService();
		context.close(); 
	}
}

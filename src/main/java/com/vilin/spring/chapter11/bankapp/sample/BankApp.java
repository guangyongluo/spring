package com.vilin.spring.chapter11.bankapp.sample;

import java.util.Date;

import com.vilin.spring.chapter11.bankapp.sample.domain.BankAccountDetails;
import com.vilin.spring.chapter11.bankapp.sample.domain.FixedDepositDetails;
import com.vilin.spring.chapter11.bankapp.sample.service.BankAccountService;
import com.vilin.spring.chapter11.bankapp.sample.service.FixedDepositService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankApp {
	public static void main(String args[]) throws Exception {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("classpath:com/vilin/spring/chapter11/bankapp/sample/applicationContext.xml");

		BankAccountService bankAccountService = context.getBean(BankAccountService.class);
		BankAccountDetails bankAccountDetails = new BankAccountDetails();
		bankAccountDetails.setBalanceAmount(1000);
		bankAccountDetails.setLastTransactionTimestamp(new Date());

		bankAccountService.createBankAccount(bankAccountDetails);

		FixedDepositService fixedDepositService = context.getBean(FixedDepositService.class);
		fixedDepositService.createFixedDeposit(new FixedDepositDetails(1, 1000, 12, "someemail@somedomain.com"));
		context.close();
	}
}

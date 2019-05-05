package com.vilin.spring.chapter08.bankapp.javaconfig.hibernate;

import java.util.Date;

import com.vilin.spring.chapter08.bankapp.javaconfig.hibernate.domain.BankAccountDetails;
import com.vilin.spring.chapter08.bankapp.javaconfig.hibernate.domain.FixedDepositDetails;
import com.vilin.spring.chapter08.bankapp.javaconfig.hibernate.service.BankAccountService;
import com.vilin.spring.chapter08.bankapp.javaconfig.hibernate.service.FixedDepositService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BankApp {
	private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

	public static void main(String args[]) throws Exception {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(DatabaseConfig.class);
		context.register(DaosConfig.class);
		context.register(ServicesConfig.class);
		context.refresh();

		BankAccountService bankAccountService = context.getBean(BankAccountService.class);
		BankAccountDetails bankAccountDetails = new BankAccountDetails();
		bankAccountDetails.setBalanceAmount(1000);
		bankAccountDetails.setLastTransactionTimestamp(new Date());

		int bankAccountId = bankAccountService.createBankAccount(bankAccountDetails);

		logger.info("Created bank account with id - " + bankAccountId);

		FixedDepositService fixedDepositService = context.getBean(FixedDepositService.class);

		FixedDepositDetails fdd = new FixedDepositDetails();
		fdd.setActive("Y");
		fdd.setBankAccountId(bankAccountDetails);
		fdd.setFdCreationDate(new Date());
		fdd.setFdAmount(500);
		fdd.setTenure(12);
		int fixedDepositId = fixedDepositService.createFixedDeposit(fdd);
		logger.info("Created fixed deposit with id - " + fixedDepositId);

		logger.info(fixedDepositService.getFixedDeposit(fixedDepositId));

		context.close();
	}
}

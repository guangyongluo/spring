package com.vilin.spring.chapter08.bankapp.tx;

import java.util.Date;

import com.vilin.spring.chapter08.bankapp.tx.domain.BankAccountDetails;
import com.vilin.spring.chapter08.bankapp.tx.domain.FixedDepositDetails;
import com.vilin.spring.chapter08.bankapp.tx.service.BankAccountService;
import com.vilin.spring.chapter08.bankapp.tx.service.FixedDepositService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankApp {
	private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

	public static void main(String args[]) throws Exception {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:com/vilin/spring/chapter08/bankapp/tx/applicationContext.xml");

		BankAccountService bankAccountService = context.getBean(BankAccountService.class);
		FixedDepositService fixedDepositService = context.getBean(FixedDepositService.class);

		BankAccountDetails bankAccountDetails = new BankAccountDetails();
		bankAccountDetails.setBalanceAmount(1000);
		bankAccountDetails.setLastTransactionTimestamp(new Date());

		int bankAccountId = bankAccountService.createBankAccount(bankAccountDetails);

		logger.info("Created bank account (with balance amount 1000) with id - " + bankAccountId);

		FixedDepositDetails fdd = new FixedDepositDetails();

		fdd.setActive("Y");
		fdd.setFdAmount(1500);
		fdd.setBankAccountId(bankAccountId);
		fdd.setFdCreationDate(new Date());
		fdd.setTenure(12);

		int fixedDepositId = fixedDepositService.createFixedDeposit(fdd);
		logger.info("Created fixed deposit (for 1500 amount) with id - " + fixedDepositId
				+ ". Check FIXED_DEPOSIT_DETAILS table to verify that the transaction was rolled back.");
		context.close();
	}
}

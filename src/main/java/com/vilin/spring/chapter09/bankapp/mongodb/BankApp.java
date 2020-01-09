package com.vilin.spring.chapter09.bankapp.mongodb;

import java.util.Date;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.vilin.spring.chapter09.bankapp.mongodb.domain.BankAccountDetails;
import com.vilin.spring.chapter09.bankapp.mongodb.domain.FixedDepositDetails;
import com.vilin.spring.chapter09.bankapp.mongodb.service.BankAccountService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class BankApp {
	private static Logger logger = LogManager.getLogger(BankApp.class);

	public static void main(String args[]) throws Exception {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.vilin.spring.chapter09.bankapp.mongodb");
		context.refresh();

		/* 
		--Uncomment this part to use XML-based configuration instead of Java-based configuration --
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:META-INF/spring/applicationContext.xml");
		*/
		BankAccountService bankAccountService = context.getBean(BankAccountService.class);
		BankAccountDetails bankAccountDetails = new BankAccountDetails();
		bankAccountDetails.setBalance(1000);
		bankAccountDetails.setLastTransactionTimestamp(new Date());

		FixedDepositDetails fd = new FixedDepositDetails();
		fd.setActive("Y");
		fd.setFdAmount(2000);
		fd.setFdCreationDate(new Date());
		fd.setTenure(6);

		bankAccountDetails.addFixedDeposit(fd);

		String bankAccountId = bankAccountService.createBankAccount(bankAccountDetails);

		logger.info("Created bank account with id - " + bankAccountId);

		// -- add a new fixed deposit to an existing account
		FixedDepositDetails fd2 = new FixedDepositDetails();
		fd2.setActive("Y");
		fd2.setFdAmount(700);
		fd2.setFdCreationDate(new Date());
		fd2.setTenure(7);

		BankAccountDetails bankAccountDetails2 = bankAccountService.findByAccountId(bankAccountId);
		bankAccountDetails2.addFixedDeposit(fd2);
		bankAccountService.createBankAccount(bankAccountDetails2);
		bankAccountService.subtractFromAccount(bankAccountId, fd2.getFdAmount());

		BankAccountDetails bankAccountDetails3 = new BankAccountDetails();
		bankAccountDetails3.setBalance(1000);
		bankAccountDetails3.setLastTransactionTimestamp(new Date());
		bankAccountService.createBankAccount(bankAccountDetails3);
		bankAccountService.findByFixedDepositsTenureLessThan(10);
		bankAccountService.countByBalance(1000);
		bankAccountService.removeByBalance(500);
		bankAccountService.findByBalance(1000);
		bankAccountService.findByFixedDepositsFdAmountGreaterThan(1000);
		bankAccountService.findTop2ByOrderByFixedDepositsFdCreationDateDesc();
		bankAccountService.findTop2ByFixedDepositsTenure(6);
		bankAccountService.findByFixedDepositsTenureAndFixedDepositsFdAmount(6, 2000);
		CompletableFuture<List<BankAccountDetails>> future = bankAccountService.findAllByBalanceGreaterThan(0);
		while (!future.isDone()) {
			logger.info("Waiting for findAllByBalanceGreaterThan method to complete .....");
		}
		logger.info(future.get());
		bankAccountService.findByCustomQuery(6, 500, "Y");

		//--queryDsl
//		logger.info("getHighValueFds " + bankAccountService.getHighValueFds());
		
		//-- query by example
		logger.info("getAllBankAccountsWithoutFds " + bankAccountService.getAllBankAccountsWithoutFds());
		
		// --close ApplicationContext
		context.close();
	}
}
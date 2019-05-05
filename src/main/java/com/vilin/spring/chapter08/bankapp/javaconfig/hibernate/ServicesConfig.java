package com.vilin.spring.chapter08.bankapp.javaconfig.hibernate;

import com.vilin.spring.chapter08.bankapp.javaconfig.hibernate.dao.BankAccountDao;
import com.vilin.spring.chapter08.bankapp.javaconfig.hibernate.dao.FixedDepositDao;
import com.vilin.spring.chapter08.bankapp.javaconfig.hibernate.service.BankAccountService;
import com.vilin.spring.chapter08.bankapp.javaconfig.hibernate.service.BankAccountServiceImpl;
import com.vilin.spring.chapter08.bankapp.javaconfig.hibernate.service.FixedDepositService;
import com.vilin.spring.chapter08.bankapp.javaconfig.hibernate.service.FixedDepositServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServicesConfig {

	@Bean
	public BankAccountService bankAccountService(BankAccountDao bankAccountDao) {
		BankAccountServiceImpl bankAccountServiceImpl = new BankAccountServiceImpl();
		bankAccountServiceImpl.setBankAccountDao(bankAccountDao);
		return bankAccountServiceImpl;
	}

	@Bean
	public FixedDepositService fixedDepositService(FixedDepositDao myFixedDepositDao, BankAccountDao bankAccountDao) {
		FixedDepositServiceImpl fixedDepositServiceImpl = new FixedDepositServiceImpl();
		fixedDepositServiceImpl.setBankAccountDao(bankAccountDao);
		fixedDepositServiceImpl.setMyFixedDepositDao(myFixedDepositDao);
		return fixedDepositServiceImpl;
	}
}

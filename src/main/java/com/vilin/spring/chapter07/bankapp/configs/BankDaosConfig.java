package com.vilin.spring.chapter07.bankapp.configs;

import com.vilin.spring.chapter07.bankapp.configs.dao.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BankDaosConfig {

	@Bean(name = "accountStatementDao")
	public AccountStatementDao accountStatementDao() {
		return new AccountStatementDaoImpl();
	}

	@Bean(name = "customerRegistrationDao")
	public CustomerRegistrationDao customerRegistrationDao() {
		return new CustomerRegistrationDaoImpl();
	}

	@Bean(name = "fixedDepositDao")
	public FixedDepositDao fixedDepositDao() {
		return new FixedDepositDaoImpl();
	}
}
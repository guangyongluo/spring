package com.vilin.spring.chapter07.bankapp.configuration;

import com.vilin.spring.chapter07.bankapp.configuration.dao.*;
import com.vilin.spring.chapter07.bankapp.configuration.domain.CustomerRegistrationDetails;
import com.vilin.spring.chapter07.bankapp.configuration.service.*;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BankAppConfiguration {
	
	public BankAppConfiguration() {
		System.out.println("Created-->");
	}
	@Bean(name = "accountStatementService")
	public AccountStatementService accountStatementService() {
		AccountStatementServiceImpl accountStatementServiceImpl = new AccountStatementServiceImpl();
		accountStatementServiceImpl.setAccountStatementDao(accountStatementDao());
		return accountStatementServiceImpl;
	}

	@Bean(name = "accountStatementDao")
	public AccountStatementDao accountStatementDao() {
		return new AccountStatementDaoImpl();
	}

	@Bean(name = "customerRegistrationService")
	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public CustomerRegistrationService customerRegistrationService() {
		return new CustomerRegistrationServiceImpl();
	}

	@Bean(name = "customerRegistrationDao")
	public CustomerRegistrationDao customerRegistrationDao() {
		return new CustomerRegistrationDaoImpl();
	}

	@Bean(name = "customerRegistrationDetails")
	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public CustomerRegistrationDetails customerRegistrationDetails() {
		return new CustomerRegistrationDetails();
	}

	@Bean(name = "fixedDepositService")
	public FixedDepositService fixedDepositService() {
		return new FixedDepositServiceImpl();
	}

	@Bean
	public FixedDepositDao fixedDepositDao() {
		return new FixedDepositDaoImpl();
	}
}
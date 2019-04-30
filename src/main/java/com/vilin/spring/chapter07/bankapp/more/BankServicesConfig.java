package com.vilin.spring.chapter07.bankapp.more;

import com.vilin.spring.chapter07.bankapp.more.dao.AccountStatementDao;
import com.vilin.spring.chapter07.bankapp.more.dao.FixedDepositDao;
import com.vilin.spring.chapter07.bankapp.more.service.*;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BankServicesConfig {
	
	@Bean(name = "accountStatementService")
	public AccountStatementService accountStatementService(AccountStatementDao accountStatementDao) {
		AccountStatementServiceImpl accountStatementServiceImpl = new AccountStatementServiceImpl();
		accountStatementServiceImpl.setAccountStatementDao(accountStatementDao);
		return accountStatementServiceImpl;
	}

	@Bean(name = "customerRegistrationService")
	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public CustomerRegistrationService customerRegistrationService() {
		return new CustomerRegistrationServiceImpl();
	}

	@Bean(name = "fixedDepositService")
	public FixedDepositService fixedDepositService(FixedDepositDao fixedDepositDao) {
		return new FixedDepositServiceImpl(fixedDepositDao);
	}
}

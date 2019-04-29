package com.vilin.spring.chapter07.bankapp.configs;

import com.vilin.spring.chapter07.bankapp.configs.dao.TransactionDaoImpl;
import com.vilin.spring.chapter07.bankapp.configs.domain.CustomerRegistrationDetails;
import com.vilin.spring.chapter07.bankapp.configs.service.TransactionServiceImpl;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

@Import({ TransactionServiceImpl.class, TransactionDaoImpl.class })
public class BankOtherObjects {
	@Bean(name = "customerRegistrationDetails")
	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public CustomerRegistrationDetails customerRegistrationDetails() {
		return new CustomerRegistrationDetails();
	}
}

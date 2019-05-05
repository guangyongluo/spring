package com.vilin.spring.chapter08.bankapp.javaconfig.hibernate;

import com.vilin.spring.chapter08.bankapp.javaconfig.hibernate.dao.BankAccountDao;
import com.vilin.spring.chapter08.bankapp.javaconfig.hibernate.dao.BankAccountDaoImpl;
import com.vilin.spring.chapter08.bankapp.javaconfig.hibernate.dao.FixedDepositDao;
import com.vilin.spring.chapter08.bankapp.javaconfig.hibernate.dao.FixedDepositDaoImpl;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaosConfig {
	
	@Bean
	public BankAccountDao bankAccountDao(SessionFactory sessionFactory){
		BankAccountDaoImpl bankAccountDaoImpl = new BankAccountDaoImpl();
		bankAccountDaoImpl.setSessionFactory(sessionFactory);
		return bankAccountDaoImpl;
	}
	
	@Bean
	public FixedDepositDao fixedDepositDao(SessionFactory sessionFactory) {
		FixedDepositDaoImpl fixedDepositDaoImpl = new FixedDepositDaoImpl();
		fixedDepositDaoImpl.setSessionFactory(sessionFactory);
		return fixedDepositDaoImpl;
	}
}

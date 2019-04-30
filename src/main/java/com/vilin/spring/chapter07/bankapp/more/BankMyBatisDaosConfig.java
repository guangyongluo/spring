package com.vilin.spring.chapter07.bankapp.more;

import com.vilin.spring.chapter07.bankapp.more.dao.AccountStatementDao;
import com.vilin.spring.chapter07.bankapp.more.dao.CustomerRegistrationDao;
import com.vilin.spring.chapter07.bankapp.more.dao.FixedDepositDao;
import com.vilin.spring.chapter07.bankapp.more.domain.DataSource;
import com.vilin.spring.chapter07.bankapp.more.mybatis.dao.AccountStatementMyBatisDaoImpl;
import com.vilin.spring.chapter07.bankapp.more.mybatis.dao.CustomerRegistrationMyBatisDaoImpl;
import com.vilin.spring.chapter07.bankapp.more.mybatis.dao.FixedDepositMyBatisDaoImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations = "classpath:com/vilin/spring/chapter07/bankapp/spring/applicationContext.xml")
public class BankMyBatisDaosConfig {
	@Value("#{dbProps.driverClassName}")
	private String driverClass;
	
	@Value("#{dbProps.url}")
	private String url;
	
	@Value("#{dbProps.username}")
	private String username;
	
	@Value("#{dbProps.password}")
	private String password;
	
	@Bean
	public AccountStatementDao accountStatementDao() {
		return new AccountStatementMyBatisDaoImpl(new DataSource(driverClass, url, username, password));
	}

	@Bean
	public CustomerRegistrationDao customerRegistrationDao() {
		return new CustomerRegistrationMyBatisDaoImpl(new DataSource(driverClass, url, username, password));
	}

	@Bean
	public FixedDepositDao fixedDepositDao() {
		return new FixedDepositMyBatisDaoImpl(new DataSource(driverClass, url, username, password));
	}
}
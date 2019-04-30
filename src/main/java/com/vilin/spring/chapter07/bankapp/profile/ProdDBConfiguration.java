package com.vilin.spring.chapter07.bankapp.profile;

import com.vilin.spring.chapter07.bankapp.profile.domain.DataSource;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@Profile("production")
@PropertySource("classpath:com/vilin/spring/chapter07/bankapp/profile/productionDB.properties")
public class ProdDBConfiguration {
	private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

	@Autowired
	private Environment env;

	public ProdDBConfiguration() {
		logger.info("initializing");
	}

	@Bean
	public DataSource dataSource() {
		return new DataSource(env.getProperty("driverClass"), env.getProperty("url"), env.getProperty("username"),
				env.getProperty("password"));
	}
}

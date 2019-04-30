package com.vilin.spring.chapter07.bankapp.profile;

import com.vilin.spring.chapter07.bankapp.profile.domain.DataSource;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@Profile({ "dev", "default" })
@PropertySource("classpath:com/vilin/spring/chapter07/bankapp/profile/devDB.properties")
public class DevDBConfiguration {
	private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

	@Value("${driverClassName}")
	private String driverClass;

	@Value("${url}")
	private String url;

	@Value("${username}")
	private String username;

	@Value("${password}")
	private String password;

	public DevDBConfiguration() {
		logger.info("initializing");
	}

	@Bean
	public DataSource dataSource() {
		return new DataSource(driverClass, url, username, password);
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}

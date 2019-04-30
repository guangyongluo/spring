package com.vilin.spring.chapter07.bankapp.more.mybatis.dao;


import com.vilin.spring.chapter07.bankapp.more.dao.CustomerRegistrationDao;
import com.vilin.spring.chapter07.bankapp.more.domain.CustomerRegistrationDetails;
import com.vilin.spring.chapter07.bankapp.more.domain.DataSource;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomerRegistrationMyBatisDaoImpl implements CustomerRegistrationDao {
	private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

	public CustomerRegistrationMyBatisDaoImpl(DataSource dataSource) {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void registerCustomer(CustomerRegistrationDetails customerRegistrationDetails) {
		logger.info("Registering customer");
	}

}

package com.vilin.spring.chapter03.bankapp.constructor.args.name.service;


import com.vilin.spring.chapter03.bankapp.constructor.args.name.base.EmailMessageSender;
import com.vilin.spring.chapter03.bankapp.constructor.args.name.base.JmsMessageSender;
import com.vilin.spring.chapter03.bankapp.constructor.args.name.base.ServiceTemplate;
import com.vilin.spring.chapter03.bankapp.constructor.args.name.base.WebServiceInvoker;
import com.vilin.spring.chapter03.bankapp.constructor.args.name.dao.FixedDepositDao;
import com.vilin.spring.chapter03.bankapp.constructor.args.name.domain.FixedDepositDetails;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.beans.ConstructorProperties;

public class FixedDepositServiceImpl extends ServiceTemplate implements FixedDepositService {
	private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

	@ConstructorProperties({"jmsMessageSender","emailMessageSender","webServiceInvoker"})
	public FixedDepositServiceImpl(JmsMessageSender jmsMessageSender,
								   EmailMessageSender emailMessageSender,
								   WebServiceInvoker webServiceInvoker) {
		super(jmsMessageSender, emailMessageSender, webServiceInvoker);
	}

	private FixedDepositDao fixedDepositDao;

	public FixedDepositDao getFixedDepositDao() {
		return fixedDepositDao;
	}

	public void setFixedDepositDao(FixedDepositDao fixedDepositDao) {
		logger.info("Setting fixedDepositDao property");
		this.fixedDepositDao = fixedDepositDao;
	}

	public FixedDepositDetails getFixedDepositDetails(long id) {
		return fixedDepositDao.getFixedDepositDetails(id);
	}

	public boolean createFixedDeposit(FixedDepositDetails fdd) {
		return fixedDepositDao.createFixedDeposit(fdd);
	}
}

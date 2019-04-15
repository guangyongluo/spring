package com.vilin.spring.chapter03.bankapp.constructor.args.type.service;

import com.vilin.spring.chapter03.bankapp.constructor.args.type.base.EmailMessageSender;
import com.vilin.spring.chapter03.bankapp.constructor.args.type.base.JmsMessageSender;
import com.vilin.spring.chapter03.bankapp.constructor.args.type.base.ServiceTemplate;
import com.vilin.spring.chapter03.bankapp.constructor.args.type.base.WebServiceInvoker;
import com.vilin.spring.chapter03.bankapp.constructor.args.type.dao.FixedDepositDao;
import com.vilin.spring.chapter03.bankapp.constructor.args.type.domain.FixedDepositDetails;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FixedDepositServiceImpl extends ServiceTemplate implements FixedDepositService {
	private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

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

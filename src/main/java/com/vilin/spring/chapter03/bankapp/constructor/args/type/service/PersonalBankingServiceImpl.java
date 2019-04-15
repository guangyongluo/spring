package com.vilin.spring.chapter03.bankapp.constructor.args.type.service;

import com.vilin.spring.chapter03.bankapp.constructor.args.type.base.EmailMessageSender;
import com.vilin.spring.chapter03.bankapp.constructor.args.type.base.JmsMessageSender;
import com.vilin.spring.chapter03.bankapp.constructor.args.type.base.ServiceTemplate;
import com.vilin.spring.chapter03.bankapp.constructor.args.type.base.WebServiceInvoker;
import com.vilin.spring.chapter03.bankapp.constructor.args.type.dao.PersonalBakingDao;
import com.vilin.spring.chapter03.bankapp.constructor.args.type.domain.BankStatement;

public class PersonalBankingServiceImpl extends ServiceTemplate implements
		PersonalBankingService {

	private PersonalBakingDao personalBakingDao;

	public PersonalBankingServiceImpl(JmsMessageSender jmsMessageSender,
									  EmailMessageSender emailMessageSender,
									  WebServiceInvoker webServiceInvoker) {
		super(jmsMessageSender, emailMessageSender, webServiceInvoker);
	}

	public void setPersonalBankingDao(PersonalBakingDao personalBakingDao) {
		this.personalBakingDao = personalBakingDao;
	}

	@Override
	public BankStatement getMiniStatement() {
		return personalBakingDao.getMiniStatement();
	}
}

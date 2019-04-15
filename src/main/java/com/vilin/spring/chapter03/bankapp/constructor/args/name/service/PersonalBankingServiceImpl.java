package com.vilin.spring.chapter03.bankapp.constructor.args.name.service;

import com.vilin.spring.chapter03.bankapp.constructor.args.name.base.EmailMessageSender;
import com.vilin.spring.chapter03.bankapp.constructor.args.name.base.JmsMessageSender;
import com.vilin.spring.chapter03.bankapp.constructor.args.name.base.ServiceTemplate;
import com.vilin.spring.chapter03.bankapp.constructor.args.name.base.WebServiceInvoker;
import com.vilin.spring.chapter03.bankapp.constructor.args.name.dao.PersonalBakingDao;
import com.vilin.spring.chapter03.bankapp.constructor.args.name.domain.BankStatement;

import java.beans.ConstructorProperties;


public class PersonalBankingServiceImpl extends ServiceTemplate implements
		PersonalBankingService {

	private PersonalBakingDao personalBakingDao;

	@ConstructorProperties({"jmsMessageSender","emailMessageSender","webServiceInvoker"})
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

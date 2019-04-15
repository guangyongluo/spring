package com.vilin.spring.chapter03.bankapp.inheritance.sample.service;


import com.vilin.spring.chapter03.bankapp.inheritance.sample.base.ServiceTemplate;
import com.vilin.spring.chapter03.bankapp.inheritance.sample.dao.PersonalBakingDao;
import com.vilin.spring.chapter03.bankapp.inheritance.sample.domain.BankStatement;

public class PersonalBankingServiceImpl extends ServiceTemplate implements PersonalBankingService {

	private PersonalBakingDao personalBakingDao;

	public void setPersonalBankingDao(PersonalBakingDao personalBakingDao) {
		this.personalBakingDao = personalBakingDao;
	}

	@Override
	public BankStatement getMiniStatement() {
		return personalBakingDao.getMiniStatement();
	}
}

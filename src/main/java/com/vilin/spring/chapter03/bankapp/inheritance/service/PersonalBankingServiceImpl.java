package com.vilin.spring.chapter03.bankapp.inheritance.service;

import com.vilin.spring.chapter03.bankapp.inheritance.dao.PersonalBakingDao;
import com.vilin.spring.chapter03.bankapp.inheritance.domain.BankStatement;

public class PersonalBankingServiceImpl implements PersonalBankingService {

	private PersonalBakingDao personalBakingDao;

	public void setPersonalBankingDao(PersonalBakingDao personalBakingDao) {
		this.personalBakingDao = personalBakingDao;
	}

	@Override
	public BankStatement getMiniStatement() {
		return personalBakingDao.getMiniStatement();
	}
}

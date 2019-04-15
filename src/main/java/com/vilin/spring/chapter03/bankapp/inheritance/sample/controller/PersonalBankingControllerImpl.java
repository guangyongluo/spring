package com.vilin.spring.chapter03.bankapp.inheritance.sample.controller;


import com.vilin.spring.chapter03.bankapp.inheritance.sample.domain.BankStatement;
import com.vilin.spring.chapter03.bankapp.inheritance.sample.service.PersonalBankingService;

public class PersonalBankingControllerImpl implements PersonalBankingController {

	private PersonalBankingService personalBankingService;

	public void setPersonalBankingService(
			PersonalBankingService personalBankingService) {
		this.personalBankingService = personalBankingService;
	}

	@Override
	public BankStatement getMiniStatement() {
		return personalBankingService.getMiniStatement();
	}

}

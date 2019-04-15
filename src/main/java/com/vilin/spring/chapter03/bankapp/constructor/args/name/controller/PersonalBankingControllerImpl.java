package com.vilin.spring.chapter03.bankapp.constructor.args.name.controller;

import com.vilin.spring.chapter03.bankapp.constructor.args.name.domain.BankStatement;
import com.vilin.spring.chapter03.bankapp.constructor.args.name.service.PersonalBankingService;

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

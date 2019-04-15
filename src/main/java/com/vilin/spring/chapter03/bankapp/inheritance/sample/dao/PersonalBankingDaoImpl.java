package com.vilin.spring.chapter03.bankapp.inheritance.sample.dao;

import com.vilin.spring.chapter03.bankapp.inheritance.sample.domain.BankStatement;
import com.vilin.spring.chapter03.bankapp.inheritance.sample.utils.DatabaseOperations;

public class PersonalBankingDaoImpl implements PersonalBakingDao {
	private DatabaseOperations databaseOperations;

	public void setDatabaseOperations(DatabaseOperations databaseOperations) {
		this.databaseOperations = databaseOperations;
	}

	@Override
	public BankStatement getMiniStatement() {
		return databaseOperations.getMiniStatement();
	}
}

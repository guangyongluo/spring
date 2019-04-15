package com.vilin.spring.chapter03.bankapp.inheritance.dao;

import com.vilin.spring.chapter03.bankapp.inheritance.domain.BankStatement;
import com.vilin.spring.chapter03.bankapp.inheritance.utils.DatabaseOperations;

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

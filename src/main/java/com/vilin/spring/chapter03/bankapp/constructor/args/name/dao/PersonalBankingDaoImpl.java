package com.vilin.spring.chapter03.bankapp.constructor.args.name.dao;

import com.vilin.spring.chapter03.bankapp.constructor.args.name.domain.BankStatement;
import com.vilin.spring.chapter03.bankapp.constructor.args.name.utils.DatabaseOperations;

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

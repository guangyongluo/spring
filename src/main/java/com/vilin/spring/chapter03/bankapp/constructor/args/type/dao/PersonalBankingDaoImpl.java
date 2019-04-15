package com.vilin.spring.chapter03.bankapp.constructor.args.type.dao;

import com.vilin.spring.chapter03.bankapp.constructor.args.type.domain.BankStatement;
import com.vilin.spring.chapter03.bankapp.constructor.args.type.utils.DatabaseOperations;

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

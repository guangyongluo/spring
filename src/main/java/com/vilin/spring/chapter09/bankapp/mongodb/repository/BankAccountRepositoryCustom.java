package com.vilin.spring.chapter09.bankapp.mongodb.repository;

interface BankAccountRepositoryCustom {
	void subtractFromAccount(String bankAccountId, int amount);
}

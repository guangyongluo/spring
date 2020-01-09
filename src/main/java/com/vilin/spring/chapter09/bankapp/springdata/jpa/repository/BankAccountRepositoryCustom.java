package com.vilin.spring.chapter09.bankapp.springdata.jpa.repository;

interface BankAccountRepositoryCustom {
	void subtractFromAccount(int bankAccountId, int amount);
}

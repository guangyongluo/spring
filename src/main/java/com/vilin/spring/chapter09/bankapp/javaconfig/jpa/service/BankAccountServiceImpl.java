package com.vilin.spring.chapter09.bankapp.javaconfig.jpa.service;

import com.vilin.spring.chapter09.bankapp.javaconfig.jpa.dao.BankAccountDao;
import com.vilin.spring.chapter09.bankapp.javaconfig.jpa.domain.BankAccountDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BankAccountServiceImpl implements BankAccountService {

	@Autowired
	private BankAccountDao bankAccountDao;

	public List<BankAccountDetails> findAccountsWithBalanceGreaterThan(int balanceAmount) {
		return bankAccountDao.findAccountsWithBalanceGreaterThan(balanceAmount);
	}

	@Override
	@Transactional
	public int createBankAccount(BankAccountDetails bankAccountDetails) {
		return bankAccountDao.createBankAccount(bankAccountDetails);
	}
}

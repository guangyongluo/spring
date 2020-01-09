package com.vilin.spring.chapter09.bankapp.springdata.jpa.service;

import com.vilin.spring.chapter09.bankapp.springdata.jpa.domain.BankAccountDetails;
import com.vilin.spring.chapter09.bankapp.springdata.jpa.repository.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BankAccountServiceImpl implements BankAccountService {

	@Autowired
	private BankAccountRepository bankAccountRepository;
	
	@Override
	@Transactional
	public int createBankAccount(BankAccountDetails bankAccountDetails) {
		return bankAccountRepository.save(bankAccountDetails).getAccountId();
	}
}

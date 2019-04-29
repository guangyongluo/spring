package com.vilin.spring.chapter07.bankapp.configuration.service;

import com.vilin.spring.chapter07.bankapp.configuration.dao.TransactionDao;
import com.vilin.spring.chapter07.bankapp.configuration.dao.TransactionDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionService {
	@Autowired
	private TransactionDao transactionDao;

	@Override
	public void getTransactions(String customerId) {
		transactionDao.getTransactions(customerId);
	}

	@Bean
	public TransactionDao transactionDao() {
		return new TransactionDaoImpl();
	}
}

package com.vilin.spring.chapter06.bankapp.annotations.service;

import java.util.List;

import com.vilin.spring.chapter06.bankapp.annotations.dao.TxDao;
import com.vilin.spring.chapter06.bankapp.annotations.domain.Tx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("txService")
@Qualifier("service")
public class TxServiceImpl implements TxService {
	@Autowired
	@Qualifier("myTx")
	private TxDao txDao;

	@Override
	public List<Tx> getTransactions(int accountNumber) {
		// --get high value transactions corresponding to the accountNumber
		return txDao.getTransactions(accountNumber);
	}
}

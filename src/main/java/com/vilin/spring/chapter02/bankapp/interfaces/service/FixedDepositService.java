package com.vilin.spring.chapter02.bankapp.interfaces.service;


import com.vilin.spring.chapter02.bankapp.interfaces.dao.FixedDepositDao;
import com.vilin.spring.chapter02.bankapp.interfaces.domain.FixedDepositDetails;

public interface FixedDepositService {
	FixedDepositDao getFixedDepositDao();

	FixedDepositDetails getFixedDepositDetails(long id);

	boolean createFixedDeposit(FixedDepositDetails fdd);

}

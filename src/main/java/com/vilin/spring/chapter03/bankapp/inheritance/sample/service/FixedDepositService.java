package com.vilin.spring.chapter03.bankapp.inheritance.sample.service;


import com.vilin.spring.chapter03.bankapp.inheritance.sample.dao.FixedDepositDao;
import com.vilin.spring.chapter03.bankapp.inheritance.sample.domain.FixedDepositDetails;

public interface FixedDepositService {
	FixedDepositDao getFixedDepositDao();

	FixedDepositDetails getFixedDepositDetails(long id);

	boolean createFixedDeposit(FixedDepositDetails fdd);

}

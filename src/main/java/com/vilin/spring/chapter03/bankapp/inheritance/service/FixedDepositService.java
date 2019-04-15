package com.vilin.spring.chapter03.bankapp.inheritance.service;


import com.vilin.spring.chapter03.bankapp.inheritance.dao.FixedDepositDao;
import com.vilin.spring.chapter03.bankapp.inheritance.domain.FixedDepositDetails;

public interface FixedDepositService {
	FixedDepositDao getFixedDepositDao();

	FixedDepositDetails getFixedDepositDetails(long id);

	boolean createFixedDeposit(FixedDepositDetails fdd);

}

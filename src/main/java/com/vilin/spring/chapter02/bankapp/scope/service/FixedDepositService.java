package com.vilin.spring.chapter02.bankapp.scope.service;

import com.vilin.spring.chapter02.bankapp.scope.dao.FixedDepositDao;
import com.vilin.spring.chapter02.bankapp.scope.domain.FixedDepositDetails;

public interface FixedDepositService {
	FixedDepositDao getFixedDepositDao();

	FixedDepositDetails getFixedDepositDetails(long id);

	boolean createFixedDeposit(FixedDepositDetails fdd);

}

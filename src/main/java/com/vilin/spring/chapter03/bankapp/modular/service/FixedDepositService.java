package com.vilin.spring.chapter03.bankapp.modular.service;

import com.vilin.spring.chapter03.bankapp.modular.dao.FixedDepositDao;
import com.vilin.spring.chapter03.bankapp.modular.domain.FixedDepositDetails;

public interface FixedDepositService {
	FixedDepositDao getFixedDepositDao();

	FixedDepositDetails getFixedDepositDetails(long id);

	boolean createFixedDeposit(FixedDepositDetails fdd);

}

package com.vilin.spring.chapter03.bankapp.constructor.args.name.service;

import com.vilin.spring.chapter03.bankapp.constructor.args.name.dao.FixedDepositDao;
import com.vilin.spring.chapter03.bankapp.constructor.args.name.domain.FixedDepositDetails;

public interface FixedDepositService {
	FixedDepositDao getFixedDepositDao();

	FixedDepositDetails getFixedDepositDetails(long id);

	boolean createFixedDeposit(FixedDepositDetails fdd);

}

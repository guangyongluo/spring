package com.vilin.spring.chapter03.bankapp.constructor.args.type.service;

import com.vilin.spring.chapter03.bankapp.constructor.args.type.dao.FixedDepositDao;
import com.vilin.spring.chapter03.bankapp.constructor.args.type.domain.FixedDepositDetails;

public interface FixedDepositService {
	FixedDepositDao getFixedDepositDao();

	FixedDepositDetails getFixedDepositDetails(long id);

	boolean createFixedDeposit(FixedDepositDetails fdd);

}

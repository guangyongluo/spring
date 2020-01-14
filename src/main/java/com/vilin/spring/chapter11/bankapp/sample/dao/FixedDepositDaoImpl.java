package com.vilin.spring.chapter11.bankapp.sample.dao;

import com.vilin.spring.chapter11.bankapp.sample.domain.FixedDepositDetails;
import org.springframework.stereotype.Repository;

@Repository(value = "fixedDepositDao")
public class FixedDepositDaoImpl implements FixedDepositDao {

	public int createFixedDeposit(final FixedDepositDetails fdd) {
		return 2;
	}

	public FixedDepositDetails getFixedDeposit(final int fixedDepositId) {
		return new FixedDepositDetails(1, 100, 12, "somedomain@someemail.com");
	}

}

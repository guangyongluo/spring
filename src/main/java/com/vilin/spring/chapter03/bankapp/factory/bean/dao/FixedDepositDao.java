package com.vilin.spring.chapter03.bankapp.factory.bean.dao;

import com.vilin.spring.chapter03.bankapp.factory.bean.domain.FixedDepositDetails;

public interface FixedDepositDao {
	boolean createFixedDeposit(FixedDepositDetails fdd);
}

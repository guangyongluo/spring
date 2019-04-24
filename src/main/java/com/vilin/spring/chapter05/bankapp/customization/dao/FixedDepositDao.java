package com.vilin.spring.chapter05.bankapp.customization.dao;


import com.vilin.spring.chapter05.bankapp.customization.domain.FixedDepositDetails;

public interface FixedDepositDao {
	boolean createFixedDeposit(FixedDepositDetails fdd);
}

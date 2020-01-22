package com.vilin.spring.chapter15.bankapp.dao;

import com.vilin.spring.chapter15.bankapp.domain.FixedDepositDetails;

import java.util.List;


public interface FixedDepositDao {
	List<FixedDepositDetails> getFixedDeposits();

	void saveFixedDeposit(FixedDepositDetails fixedDepositDetails);

	void closeFixedDeposit(int fixedDepositId);

	FixedDepositDetails getFixedDeposit(int fixedDepositId);

	void editFixedDeposit(FixedDepositDetails fixedDepositDetails);
}

package com.vilin.spring.chapter05.bankapp.beanpostprocessor.dao;


import com.vilin.spring.chapter05.bankapp.beanpostprocessor.domain.FixedDepositDetails;

public interface FixedDepositDao {
	boolean createFixedDeposit(FixedDepositDetails fdd);
}

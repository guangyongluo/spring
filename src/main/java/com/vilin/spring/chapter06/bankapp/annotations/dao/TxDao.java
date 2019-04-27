package com.vilin.spring.chapter06.bankapp.annotations.dao;

import com.vilin.spring.chapter06.bankapp.annotations.domain.Tx;

import java.util.List;


public interface TxDao {
	List<Tx> getTransactions(int accountNumber);
}

package com.vilin.spring.chapter06.bankapp.annotations.service;

import com.vilin.spring.chapter06.bankapp.annotations.domain.Tx;

import java.util.List;

public interface TxService extends MyService {
	List<Tx> getTransactions(int accountNumber);
}

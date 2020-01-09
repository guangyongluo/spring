package com.vilin.spring.chapter09.bankapp.springdata.jpa.repository;

import com.vilin.spring.chapter09.bankapp.springdata.jpa.domain.FixedDepositDetails;

import java.util.List;

public interface FixedDepositRepositoryCustom {
	List<FixedDepositDetails> findByTenure(int tenure);
}

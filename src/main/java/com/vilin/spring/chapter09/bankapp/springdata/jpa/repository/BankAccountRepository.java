package com.vilin.spring.chapter09.bankapp.springdata.jpa.repository;


import com.vilin.spring.chapter09.bankapp.springdata.jpa.domain.BankAccountDetails;
import com.vilin.spring.chapter09.bankapp.springdata.jpa.domain.FixedDepositDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface BankAccountRepository extends JpaRepository<BankAccountDetails, Integer>, BankAccountRepositoryCustom,
		QuerydslPredicateExecutor<FixedDepositDetails> {
	
}

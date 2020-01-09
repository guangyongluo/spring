package com.vilin.spring.chapter09.bankapp.javaconfig.jpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.vilin.spring.chapter09.bankapp.javaconfig.jpa.domain.FixedDepositDetails;
import org.springframework.stereotype.Repository;

@Repository
public class FixedDepositDaoImpl implements FixedDepositDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	public int createFixedDeposit(final FixedDepositDetails fixedDepositDetails) {
		entityManager.persist(fixedDepositDetails);
		return fixedDepositDetails.getFixedDepositId();
	}

	public FixedDepositDetails getFixedDeposit(final int fixedDepositId) {
		return entityManager.find(FixedDepositDetails.class, fixedDepositId);
	}
}

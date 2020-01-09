package com.vilin.spring.chapter09.bankapp.springdata.jpa.repository;

import com.vilin.spring.chapter09.bankapp.springdata.jpa.domain.FixedDepositDetails;
import com.vilin.spring.chapter09.bankapp.springdata.jpa.exceptions.NoFixedDepositFoundException;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class FixedDepositRepositoryImpl {

	@PersistenceContext
	private EntityManager entityManager;

	public List<FixedDepositDetails> findByTenure(int tenure) {
		List<FixedDepositDetails> fds = entityManager
				.createQuery("SELECT details from FixedDepositDetails details where details.tenure = :tenure",
						FixedDepositDetails.class)
				.setParameter("tenure", tenure).getResultList();
		if (fds.isEmpty()) {
			throw new NoFixedDepositFoundException("No fixed deposits found");
		}
		return fds;
	}
}

package com.vilin.spring.chapter08.bankapp.javaconfig.hibernate.dao;

import com.vilin.spring.chapter08.bankapp.javaconfig.hibernate.domain.FixedDepositDetails;
import org.hibernate.SessionFactory;

public class FixedDepositDaoImpl implements FixedDepositDao {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public int createFixedDeposit(final FixedDepositDetails fixedDepositDetails) {
		sessionFactory.getCurrentSession().save(fixedDepositDetails);
		return fixedDepositDetails.getFixedDepositId();
	}

	public FixedDepositDetails getFixedDeposit(final int fixedDepositId) {
		String hql = "from FixedDepositDetails as fixedDepositDetails where fixedDepositDetails.fixedDepositId =" + fixedDepositId;
		return (FixedDepositDetails) sessionFactory.getCurrentSession().createQuery(hql).uniqueResult();
	}
}

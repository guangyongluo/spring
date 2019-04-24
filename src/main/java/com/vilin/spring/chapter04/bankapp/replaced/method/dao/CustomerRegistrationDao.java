package com.vilin.spring.chapter04.bankapp.replaced.method.dao;


import com.vilin.spring.chapter04.bankapp.replaced.method.domain.CustomerRegistrationDetails;

public interface CustomerRegistrationDao {
	void registerCustomer(CustomerRegistrationDetails customerRegistrationDetails);
}

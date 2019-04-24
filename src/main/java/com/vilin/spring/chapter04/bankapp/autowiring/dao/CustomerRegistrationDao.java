package com.vilin.spring.chapter04.bankapp.autowiring.dao;


import com.vilin.spring.chapter04.bankapp.autowiring.domain.CustomerRegistrationDetails;

public interface CustomerRegistrationDao {
	void registerCustomer(
            CustomerRegistrationDetails customerRegistrationDetails);
}

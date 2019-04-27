package com.vilin.spring.chapter06.bankapp.annotations.dao;

import com.vilin.spring.chapter06.bankapp.annotations.domain.CustomerRegistrationDetails;

public interface CustomerRegistrationDao {
	void registerCustomer(
            CustomerRegistrationDetails customerRegistrationDetails);
}

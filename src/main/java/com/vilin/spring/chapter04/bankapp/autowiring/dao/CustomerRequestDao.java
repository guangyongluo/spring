package com.vilin.spring.chapter04.bankapp.autowiring.dao;


import com.vilin.spring.chapter04.bankapp.autowiring.domain.CustomerRequestDetails;

public interface CustomerRequestDao {
	void submitRequest(CustomerRequestDetails userRequestDetails);
}

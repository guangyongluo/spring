package com.vilin.spring.chapter04.bankapp.lookup.method.dao;


import com.vilin.spring.chapter04.bankapp.lookup.method.domain.CustomerRequestDetails;

public interface CustomerRequestDao {
	void submitRequest(CustomerRequestDetails userRequestDetails);
}

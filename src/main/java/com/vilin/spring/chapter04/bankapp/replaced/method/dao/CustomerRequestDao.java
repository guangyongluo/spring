package com.vilin.spring.chapter04.bankapp.replaced.method.dao;


import com.vilin.spring.chapter04.bankapp.replaced.method.domain.CustomerRequestDetails;

public interface CustomerRequestDao {
	void submitRequest(CustomerRequestDetails userRequestDetails);
}

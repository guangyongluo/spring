package com.vilin.spring.chapter04.bankapp.context.aware.dao;

import com.vilin.spring.chapter04.bankapp.context.aware.domain.CustomerRequestDetails;

public interface CustomerRequestDao {
	void submitRequest(CustomerRequestDetails userRequestDetails);
}

package com.vilin.spring.chapter06.bankapp.jsr349.validation.service;

import java.util.Calendar;

import com.vilin.spring.chapter06.bankapp.jsr349.validation.dao.CustomerRequestDao;
import com.vilin.spring.chapter06.bankapp.jsr349.validation.domain.CustomerRequestDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("customerRequestService")
public class CustomerRequestServiceImpl implements CustomerRequestService {
	@Autowired
	private CustomerRequestDao customerRequestDao;

	@Override
	public Calendar submitRequest(String type, String description, Calendar accountSinceDate) {
		CustomerRequestDetails details = new CustomerRequestDetails();
		details.setType(type);
		details.setDescription(description);
		customerRequestDao.submitRequest(details);
		details.setAccountSinceDate(accountSinceDate);
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, -1);
		return cal;
	}
}

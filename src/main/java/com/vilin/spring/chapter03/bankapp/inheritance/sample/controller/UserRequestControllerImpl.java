package com.vilin.spring.chapter03.bankapp.inheritance.sample.controller;

import com.vilin.spring.chapter03.bankapp.inheritance.sample.base.ServiceTemplate;
import com.vilin.spring.chapter03.bankapp.inheritance.sample.domain.Request;

public class UserRequestControllerImpl implements UserRequestController {
	private ServiceTemplate serviceTemplate;
	
	public void setServiceTemplate(ServiceTemplate serviceTemplate) {
		this.serviceTemplate = serviceTemplate;
	}
	
	@Override
	public void submitRequest(Request request) {
		//-- do something using ServiceTemplate
		serviceTemplate.getJmsMessageSender(); //-- For ex., send JMS message
	}
}

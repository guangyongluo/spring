package com.vilin.spring.chapter03.bankapp.constructor.args.type.controller;

import com.vilin.spring.chapter03.bankapp.constructor.args.type.base.ServiceTemplate;
import com.vilin.spring.chapter03.bankapp.constructor.args.type.domain.Request;

public class UserRequestControllerImpl implements UserRequestController {
	private ServiceTemplate serviceTemplate;
	
	public UserRequestControllerImpl(ServiceTemplate serviceTemplate) {
		this.serviceTemplate = serviceTemplate;
	}
	
	@Override
	public void submitRequest(Request request) {
		//-- do something using ServiceTemplate
		serviceTemplate.getJmsMessageSender(); //-- For ex., send JMS message
	}
}

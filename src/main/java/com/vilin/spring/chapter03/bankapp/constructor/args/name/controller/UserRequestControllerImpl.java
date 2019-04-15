package com.vilin.spring.chapter03.bankapp.constructor.args.name.controller;

import com.vilin.spring.chapter03.bankapp.constructor.args.name.base.ServiceTemplate;
import com.vilin.spring.chapter03.bankapp.constructor.args.name.domain.Request;

import java.beans.ConstructorProperties;

public class UserRequestControllerImpl implements UserRequestController {
	private ServiceTemplate serviceTemplate;
	
	@ConstructorProperties({"serviceTemplate"})
	public UserRequestControllerImpl(ServiceTemplate serviceTemplate) {
		this.serviceTemplate = serviceTemplate;
	}
	
	@Override
	public void submitRequest(Request request) {
		//-- do something using ServiceTemplate
		serviceTemplate.getJmsMessageSender(); //-- For ex., send JMS message
	}
}

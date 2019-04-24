package com.vilin.spring.chapter04.bankapp.replaced.method.service;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

import com.vilin.spring.chapter04.bankapp.replaced.method.Constants;
import org.springframework.core.io.ClassPathResource;


public class EventSenderSelectorServiceImpl {

	public EventSenderSelectorServiceImpl(String configFile) throws Exception {
		ClassPathResource resource = new ClassPathResource(configFile);
		OutputStream os = new FileOutputStream(resource.getFile());

		Properties properties = new Properties();
		properties
				.setProperty(Constants.EVENT_SENDER_CLASS_PROPERTY,
						"com.vilin.spring.chapter04.bankapp.replaced.method.event.DatabaseEventSender");
		properties.store(os, null);
		properties.list(System.out);
		os.flush();
		os.close();
	}
}

package com.vilin.spring.chapter06.bankapp.lazy.dependencies;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class MyServices {
	private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
	
	@Autowired
	@Lazy
	private StatelessService statelessService;
	
	@Autowired
	@Lazy
	private StatefulService statefulService;

	public void useStateless() {
		logger.info(" --> " + statelessService);
	}

	public void useStateful() {
		logger.info(" --> " + statefulService);
	}
}

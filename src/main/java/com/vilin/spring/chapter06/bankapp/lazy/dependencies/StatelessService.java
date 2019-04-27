package com.vilin.spring.chapter06.bankapp.lazy.dependencies;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class StatelessService {
	private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
	
	public StatelessService() {
		logger.info("Created StatelessService");
	}
}

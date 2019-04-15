package com.vilin.spring.chapter03.bankapp.constructor.args.name.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.beans.ConstructorProperties;

public class ServiceTemplate {
	private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

	private JmsMessageSender jmsMessageSender;
	private EmailMessageSender emailMessageSender;
	private WebServiceInvoker webServiceInvoker;

	@ConstructorProperties({"jmsMessageSender","emailMessageSender","webServiceInvoker"})
	public ServiceTemplate(JmsMessageSender jmsMessageSender,
			EmailMessageSender emailMessageSender,
			WebServiceInvoker webServiceInvoker) {
		this.jmsMessageSender = jmsMessageSender;
		this.emailMessageSender = emailMessageSender;
		this.webServiceInvoker = webServiceInvoker;

		logger.info("Invoked constructor: ServiceTemplate(JmsMessageSender jmsMessageSender,"
				+ "EmailMessageSender emailMessageSender,"
				+ "WebServiceInvoker webServiceInvoker) ");
	}

	public JmsMessageSender getJmsMessageSender() {
		return jmsMessageSender;
	}

	public void setJmsMessageSender(JmsMessageSender jmsMessageSender) {
		this.jmsMessageSender = jmsMessageSender;
	}

	public EmailMessageSender getEmailMessageSender() {
		return emailMessageSender;
	}

	public void setEmailMessageSender(EmailMessageSender emailMessageSender) {
		this.emailMessageSender = emailMessageSender;
	}

	public WebServiceInvoker getWebServiceInvoker() {
		return webServiceInvoker;
	}

	public void setWebServiceInvoker(WebServiceInvoker webServiceInvoker) {
		this.webServiceInvoker = webServiceInvoker;
	}
}

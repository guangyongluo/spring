package com.vilin.spring.chapter04.bankapp.lookup.method.event;

import java.util.Map;

public interface Event {
	String getEventType();
	void setEventData(Map<String, Object> eventData);
	Map<String, Object> getEventData();
}

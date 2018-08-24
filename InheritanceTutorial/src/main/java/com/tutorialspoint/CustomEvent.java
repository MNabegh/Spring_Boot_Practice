package com.tutorialspoint;

import org.springframework.context.ApplicationEvent;

@SuppressWarnings("serial")
public class CustomEvent extends ApplicationEvent {

	public CustomEvent(Object source) {
		super(source);
	}
	
	public String toString()
	{
		return "My Custom Event";
	}

}

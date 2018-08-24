package com.tutorialspoint;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class MainApp {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AbstractApplicationContext context = new AnnotationConfigApplicationContext
				(HelloConfiguration.class);
		HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
	      objA.getMessage();
	      context.registerShutdownHook();
	   }
	
	

}

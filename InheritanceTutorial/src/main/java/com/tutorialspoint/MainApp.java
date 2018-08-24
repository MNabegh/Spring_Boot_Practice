package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.apache.log4j.Logger;


public class MainApp {
	static Logger log = Logger.getLogger(MainApp.class.getName());

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(HelloConfiguration.class);
	      log.info("Going to create HelloWord Obj");
	      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
	      obj.getMessage();
	      
	      log.info("Exiting the program");
	}



}

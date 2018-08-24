package com.tutorialspoint;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class HelloConfiguration {
	
	@Bean(name = "helloWorld")
	public HelloWorld helloWorld()
	{
		HelloWorld toBereturned = new HelloWorld();
		toBereturned.setMessage("Hello World!");
//		toBereturned.setMessage2("Hello Second World!");
		return toBereturned;
	}
	
	@Bean(name = "helloIndia")
	public HelloIndia helloIndia()
	{
		HelloIndia toBereturned = new HelloIndia();
		toBereturned.setMessage1("Hello India!");
		toBereturned.setMessage3("Namaste India!");
		return toBereturned;
	}
	
	@Bean
	public SpellChecker spellChecker()
	{
		return new SpellChecker();
	}
	
	@Bean
	public Student student()
	{
		return new Student();
		
	}
	
	@Bean
	public CStartEventHandler cstartEventHandler()
	{
		return new CStartEventHandler();
	}
	
	@Bean
	public CStopEventHandler cStopEventHandler()
	{
		return new CStopEventHandler();
	}
	
	@Bean
	public CustomEventPublisher customEventPublisher()
	{
		return new CustomEventPublisher();
	}
	
	@Bean
	public CustomEventHandler customEventHandler()
	{
		return new CustomEventHandler();
	}

}

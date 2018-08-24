package com.tutorialspoint;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfiguration {
	
	@Bean(name = "helloWorld")
	public HelloWorld helloWorld()
	{
		HelloWorld toBereturned = new HelloWorld();
		return toBereturned;
	}
	
	@Bean
	public InitHelloWorld initHelloWorld()
	{
		return new InitHelloWorld();
	}

}

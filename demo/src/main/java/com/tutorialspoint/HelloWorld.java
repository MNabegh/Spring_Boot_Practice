package com.tutorialspoint;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloWorld implements InitializingBean, DisposableBean
{
	   private String message;
	   
	   
	   public void setMessage(String message)
	   {
	      this.message  = message;
	   }
	   public void getMessage()
	   {
	      System.out.println("Your Message : " + message);
	   }
	   
	@Override
	public void afterPropertiesSet() throws Exception
	{
		System.out.println("Init Bean");		
	}
	
	@Override
	public void destroy() throws Exception
	{
		System.out.println("Destroying Bean");		
	}
}

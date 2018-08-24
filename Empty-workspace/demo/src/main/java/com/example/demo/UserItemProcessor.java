package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class UserItemProcessor implements ItemProcessor<User, User>
{
	private static final Logger logger =
			LoggerFactory.getLogger(UserItemProcessor.class);

	@Override
	public User process(final User user) throws Exception
	{
		final String firstName = user.getFirstName().toUpperCase();
		final String lastName = user.getLastName().toUpperCase();
		final User transformedPerson = new User(firstName, lastName);
		// TODO Auto-generated method stub
		logger.info("Converting (" + user + ") into (" + transformedPerson + ")");
		return transformedPerson;
	}

}

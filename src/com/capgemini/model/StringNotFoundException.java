package com.capgemini.model;

public class StringNotFoundException extends Exception {

	String message;
	public StringNotFoundException(String message)
	{
		super(message);
	}
}

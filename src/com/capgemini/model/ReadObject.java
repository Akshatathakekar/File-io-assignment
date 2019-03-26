
package com.capgemini.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ReadObject implements Serializable {

	public Employee DeSerialization(String filepath) throws IOException, ClassNotFoundException
	{
	
		FileInputStream inputStream=new FileInputStream(filepath);
		ObjectInputStream input=new ObjectInputStream(inputStream);
		
		Employee employee = (Employee) input.readObject();
		input.close();
		inputStream.close();
		
		return employee;
	}
}

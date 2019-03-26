package com.capgemini.model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class MyClass implements Serializable {

	private int employeeId;
	private String employeeName;
	
	public MyClass() {
		super();
	}

	public MyClass(int id, String name) {
		super();
		employeeId = id;
		employeeName = name;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + employeeId;
		result = prime * result + ((employeeName == null) ? 0 : employeeName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyClass other = (MyClass) obj;
		if (employeeId != other.employeeId)
			return false;
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		return true;
	}

	public Object deSerialization(String filepath) throws IOException, ClassNotFoundException
	{
	
		FileInputStream inputStream=new FileInputStream(filepath);
		ObjectInputStream input=new ObjectInputStream(inputStream);
		
		Object object = input.readObject();
		input.close();
		inputStream.close();
		
		return object;
	}

	public boolean serialization(Object object, String filePath) throws IOException {
		FileOutputStream fileoutput = new FileOutputStream(filePath);
		ObjectOutputStream objectOutput = new ObjectOutputStream(fileoutput);
		objectOutput.writeObject(object);
		objectOutput.close();
		fileoutput.close();
		return true;
	}
	

}

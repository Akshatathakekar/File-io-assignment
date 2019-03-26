package com.capgemini.Test;


import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.capgemini.model.Employee;
import com.capgemini.model.ReadObject;
import com.capgemini.model.WriteObject;

public class EmployeeTest {

	@Test
	public void testSerialization() throws ClassNotFoundException, IOException {
		
		Employee e=new Employee(101,"John",20000);
		
		WriteObject writeObject=new WriteObject();
		writeObject.doSerialization(e,"employee.ser");
		
		File file = new File("employee.ser");
		assertTrue(file.exists());

	}

	@Test
	public void testDeSerialization() throws ClassNotFoundException, IOException {
		Employee e=new Employee(101,"John",20000);

		ReadObject read = new ReadObject();
		Employee e1 =  read.DeSerialization("employee.ser");
		System.out.println(e1);
//		assertTrue(e1.equals(e));
		assertEquals(e, e1);
	}
}

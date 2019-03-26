package com.capgemini.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.model.MyClass;

public class MyClassTest {

	ArrayList<MyClass> my;
	MyClass m1;
	@Before
	public void setUp()
	{
		m1=new MyClass(11,"John");
		MyClass m2=new MyClass(12,"John Doe");
		MyClass m3=new MyClass(13,"Grant");
		MyClass m4=new MyClass(14,"Benny");
		MyClass m5=new MyClass(15,"Doe");

		my=new 	ArrayList<MyClass>();
		my.add(m1);
		my.add(m2);
		my.add(m3);
		my.add(m4);
		my.add(m5);
		
	}
	
	@Test
	public void testSerialization() throws IOException {
		
		MyClass s=new MyClass();
		assertTrue(s.serialization(my,"myclass.ser"));
	
	}


	@Test
	public void testDeSerialization() throws ClassNotFoundException, IOException {
	
		MyClass p = new MyClass();
		ArrayList<MyClass> ar=(ArrayList<MyClass>) p.deSerialization("myclass.ser");
		
		Iterator iterator=ar.iterator();
		
		assertEquals(m1,iterator.next());
	}

}

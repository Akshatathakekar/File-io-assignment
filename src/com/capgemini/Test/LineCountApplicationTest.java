package com.capgemini.Test;


import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import com.capgemini.model.LineCountApplication;

public class LineCountApplicationTest {

	@Test
	public void testLineCount() throws IOException {
		LineCountApplication line=new LineCountApplication();
		assertEquals(5, line.countLines());
	}
	
}

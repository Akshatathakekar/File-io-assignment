package com.capgemini.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import com.capgemini.model.GrepApplication;
import com.capgemini.model.StringNotFoundException;

public class GrepApplicationTest {

	@Test
	public void testWhenStringPrsent() throws IOException, StringNotFoundException {

		GrepApplication grep = new GrepApplication();

//		TreeMap<Integer, String> map1 = grep.checkStringPresence("Java");
//		int a = 0;
//		for (Entry<Integer, String> m : map1.entrySet()) {
//
//			System.out.println("........" + m.getKey() + " " + m.getValue());
//			while (map1.size() > a) {
//				
//				a++;
//				Assert.assertThat(m.getValue(), containsString("Java"));
//
//			}

		int a = grep.checkStringPresence("Java");
		assertEquals(8, a);

	}

	@Test(expected = StringNotFoundException.class)
	public void testStringNotFound() throws IOException, StringNotFoundException {
		GrepApplication grep = new GrepApplication();
		int a = grep.checkStringPresence("Hello");
		assertEquals(0, a);

	}
}

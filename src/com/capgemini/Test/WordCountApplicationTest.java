package com.capgemini.Test;


import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import com.capgemini.model.WordCountApplication;

public class WordCountApplicationTest {

	@Test
	public void testValidWordCount() throws IOException {
		
		WordCountApplication word=new WordCountApplication();
		assertEquals(106, word.checkWordCount());
		System.out.println(word.checkWordCount());
	}

	@Test
	public void testInvalidWordCount() throws IOException {
		
		WordCountApplication word=new WordCountApplication();
		assertEquals(0, word.checkWordCount());
		System.out.println(word.checkWordCount());

	}
}

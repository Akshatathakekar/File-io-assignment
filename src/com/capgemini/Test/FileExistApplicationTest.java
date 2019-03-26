package com.capgemini.Test;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.junit.Test;

import com.capgemini.model.FileExistApplication;

public class FileExistApplicationTest {

	@Test
	public void testFileExist() {

		FileExistApplication file=new FileExistApplication();
		assertEquals(true, file.checkFileExist());
		
	}

	@Test
	public void testFileNotExist() {
				
		File file1=new File("C:\\java_core_pgm\\abc11.txt");
		assertEquals(false, file1.exists());

	}

	
}

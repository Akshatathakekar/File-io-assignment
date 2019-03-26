package com.capgemini.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class LineCountApplication {

	public int countLines() throws IOException
	{
		int count=0;
		FileReader fileReader=new FileReader("C:\\java_core_pgm\\abc.txt");
		BufferedReader reader=new BufferedReader(fileReader);
	
		while(reader.readLine()!=null)
		{
			++count;
		}
		System.out.println(count);

		fileReader.close();
		reader.close();
		
		return count;
	}
	
}

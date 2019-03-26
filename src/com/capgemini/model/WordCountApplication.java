package com.capgemini.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordCountApplication {

	public int checkWordCount() throws IOException {
		int count = 0;
		String content;
		FileReader fileReader = new FileReader("C:\\java_core_pgm\\word.txt");
		BufferedReader reader = new BufferedReader(fileReader);

		FileReader fileReader1 = new FileReader("C:\\java_core_pgm\\aaa.txt");
		BufferedReader reader1 = new BufferedReader(fileReader1);
		
		while ((content = reader.readLine()) != null) {
			String s[] = content.split("\\s+");

			for (String str : s) {
				System.out.println(str);

				++count;
			}

		}
		
		while(reader1.readLine() == null)
		{
			count=0;
		}
		
		fileReader1.close();
		reader1.close();
		fileReader.close();
		reader.close();

		return count;
	}
	
	

}

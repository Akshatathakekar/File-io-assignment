package com.capgemini.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GrepApplication {

	public int line;
	public int count;

	public  int checkStringPresence(String pattern) throws IOException, StringNotFoundException {
		//String pattern ;
		String content;
		int c=0;
		int a=0;
		line = 0;

		FileReader fileReader = new FileReader("C:\\java_core_pgm\\word.txt");
		BufferedReader reader = new BufferedReader(fileReader);
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		while ((content = reader.readLine()) != null) {
			int count = 0;
			Pattern p = Pattern.compile(pattern);
			Matcher m = p.matcher(content);
			++line;
			while (m.find()) {
							
			count++;

			}
			c=c+count;

			if (count > 0) {
				System.out.println("line number " + line + "contains count of java is " + count);
				map.put(line, content);
			}
			
			
		}
		System.out.println(c);
		for (Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		if(c==0)
		{
			throw new StringNotFoundException("string was not found");
		}
		return c;

	}

}

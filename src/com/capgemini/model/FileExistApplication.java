package com.capgemini.model;

import java.io.File;

public class FileExistApplication {

	public boolean checkFileExist()
	{
		File file=new File("C:\\java_core_pgm\\abc.txt");
		
		if(file.exists())
		{	
			System.out.println("created");
			return true;
		}
		else
		{
			System.out.println("Not Created");
			return false;
		}
	}
	
}

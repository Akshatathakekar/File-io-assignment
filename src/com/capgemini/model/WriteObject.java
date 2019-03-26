package com.capgemini.model;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class WriteObject implements Serializable {

	public void doSerialization(Object object, String filePath) throws IOException {
		FileOutputStream fileoutput = new FileOutputStream(filePath);
		ObjectOutputStream objectOutput = new ObjectOutputStream(fileoutput);
		objectOutput.writeObject(object);
		objectOutput.close();
		fileoutput.close();

	}
}

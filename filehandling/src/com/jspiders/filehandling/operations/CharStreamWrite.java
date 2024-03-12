package com.jspiders.filehandling.operations;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamWrite {
public static void main(String[] args) throws IOException {
	File file=new File("D:\\Demo.txt");
	if(file.exists()) {
		FileWriter fileWriter=new FileWriter(file);
		fileWriter.write("java is programming language");
		System.out.println("data is written to the file");
		fileWriter.close();
		
	}
	else {
		boolean status=file.createNewFile();
		if(status) {
			System.out.println("file is created");
			FileWriter fileWriter=new FileWriter(file);
			fileWriter.write("java is programming language");
			System.out.println("data is written to the file");
			fileWriter.close();
		}
		else {
			System.out.println("file is not created");
		}
	}
	
}
}

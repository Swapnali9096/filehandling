package com.jspiders.filehandling.operations;

import java.io.File;
import java.io.IOException;

public class CreateNewFile1 {
	public static void main(String[] args) {
		File file=new File("D:\\Demo.txt");
		try {
			boolean status=file.createNewFile();
			if(status) {
				System.out.println("file is created");
			}
			else {
				System.out.println("file is already exists");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

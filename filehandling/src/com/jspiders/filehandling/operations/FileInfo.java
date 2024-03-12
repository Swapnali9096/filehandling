package com.jspiders.filehandling.operations;

import java.io.File;

public class FileInfo {
public static void main(String[] args) {
	File file=new File("D:\\Demo.txt");
	if(file.exists()) {
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.length());
		if(file.canWrite()) {
			System.out.println("file is writable");
		}
		else {
			System.out.println("file is not writable");
		}
		if(file.canRead()) {
			System.out.println("file is readable");
		}
		else {
			System.out.println("file is not readable");
		}
		if(file.canExecute()) {
			System.out.println("file is excutable");
		}
		else {
			System.out.println("file is not excutable");
		}
	}
	else {
		System.out.println("file does not exist");
	}
}
}

package com.jspiders.filehandling.operations;

import java.io.File;

public class DeleteFile {
public static void main(String[] args) {
	File file=new File("Demo.txt");
if(file.exists()) {
	boolean status=file.delete();
    if(status) {
    	System.out.println("file is deleted");
    }
    else {
    	System.out.println("file is not deleted");
    }
}
else {
	System.out.println("file does not exists ");
}
}
}

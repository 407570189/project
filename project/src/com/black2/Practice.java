package com.black2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Practice {

	public static void main(String[] args) {
		int n =Integer.parseInt("26");
		File file = new File("C:\\cygwin");
		if(file.exists()&&file.isDirectory()) {
		File[] files =file.listFiles();
		for(File f:files) {
			if(f.isFile()) {
				System.out.println(file.getName());
			}
		}
		
			System.out.println(file.mkdir());
			File aa =new File(file,"AAAA");
			System.out.println(aa.mkdir());
		}
		
		/*if(file.exists()==true) {			
		}
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
	    System.out.println(file.length());
		
		System.out.println(file.canExecute());
		System.out.println(file.exists());
		System.out.println(file.isDirectory());
		/*try {
		FileReader fr = new FileReader("aaa.tx");
		} catch(FileNotFoundException e) {
	    		
		}*/
	}
	
}

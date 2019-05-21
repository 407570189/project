package com.black2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;



public abstract class Test5 {

	public static void main(String[] args) throws IOException {
		
		try {
			FileInputStream fits = new FileInputStream("data.txt");
			Reader in=new InputStreamReader(fits);
			int n =in.read();
			while(n!=-1) {
				System.out.println((char)n);
				n=in.read();
			}
		}catch(FileNotFoundException e) {
		e.printStackTrace();		
		}

	}

}

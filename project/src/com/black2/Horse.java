package com.black2;

public class Horse extends Thread {
	public Horse(String name) {
		setName(name);
	}
	
	public void run() {
	for(int i =1;i<=50;i++) {
		StringBuilder spaces = new StringBuilder();
		{
		for(int  j=0;j<i;j++) {
			spaces.append("");
		}
		System.out.println(getName()+spaces.toString()+i);
	}
		
	
		
		
	}
 }
	
}

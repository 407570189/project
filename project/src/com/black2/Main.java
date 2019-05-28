package com.black2;

public class Main {
	public static void main(String[] args) {
		/*for(int i =1;i<=1000;i++) 		{
			System.out.println("Horse1:"+i);
			}
		for(int i =1;i<=1000;i++) {
			System.out.println("Horse2:"+i);
	}*/
	Horse h1= new Horse("H1:") ;	
	h1.start();
	Horse h2=new Horse("H2:");
	h2.start();
	/*h.start();
	Horserunnable hr = new Horserunnable();
	Thread thread=new Thread(hr);
	thread.start();*/
	
	System.out.println("main end");	
	}	
}

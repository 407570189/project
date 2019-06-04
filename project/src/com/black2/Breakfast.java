package com.black2;

public class Breakfast extends Thread{
	public void run() {
		try {
			System.out.println("Making Breakfast");
			Thread.sleep(4000);
			System.out.println("eating");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

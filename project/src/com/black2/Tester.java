package com.black2;

public class Tester {

	public static void main(String[] args)  {

		System.out.println("Good Morning");
		
		Breakfast breakfast = new Breakfast();
		breakfast.start();
		try {
			breakfast.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BrushTeeth brush = new BrushTeeth();
		Thread thread =new Thread(brush);
		thread.start();
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main end");
	}

}

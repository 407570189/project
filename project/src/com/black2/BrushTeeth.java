package com.black2;

public class BrushTeeth implements Runnable {
	public void run() {
		try {
			System.out.println("brushing teeth");
			Thread.sleep(3000);
			System.out.println("brushed");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

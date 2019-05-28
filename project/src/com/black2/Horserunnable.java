package com.black2;

public class Horserunnable  implements Runnable{

	@Override
	public void run() {
		for(int i =1;i<=1000;i++) {
			System.out.println("Horse1:"+i);
		}
	}
}
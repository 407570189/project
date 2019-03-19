package com.black;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTester {

	public static void main(String[] args) {
		Random rand = new Random();
		List<Integer>list = new ArrayList<>();
		for(int i =0;i<20;i++) {
			list.add(0);
		}
		for(int i =0;i<10000;i++) {
			int r =rand.nextInt(20);
			Integer frep =list.get(r);
			list.set(r,frep+1);
				
			}
			System.out.println(list);
		}

	}



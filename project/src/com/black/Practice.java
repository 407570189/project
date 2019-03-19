package com.black;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Practice {

	public static void main(String[] args) {
		Random rand = new Random();
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<10000;i++)
		{
			int r = rand.nextInt(50);
			Integer frep = map.get(r);
			if(frep ==null) {
				map.put(r, 1);
			}
			else {
				map.put(r, frep+1);
			}
		}
		System.out.println(map);
	}

}

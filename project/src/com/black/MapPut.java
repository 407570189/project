package com.black;

import java.util.HashMap;
import java.util.Map;

public class MapPut {

	public static void main(String[] args) {
		 Map<Integer, String> map = new HashMap<>();
	        map.put(1, "Jack");
	        map.put(2, "Hank");
	        map.put(1, "Eric");
	        System.out.println(map.get(0));
	}

}

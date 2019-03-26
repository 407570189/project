package com.black;

import java.util.HashMap;
import java.util.Map;

public class MapPut {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();

		map.put(1, 38);

		map.put(6, 77);

		System.out.println(map.get(1));

	}

}

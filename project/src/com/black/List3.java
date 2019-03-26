package com.black;

import java.util.ArrayList;
import java.util.List;

public class List3 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		for (int i=0; i<10; i++) {

		   list.add(i);

		}

		System.out.println(list.get(9));

	}

}

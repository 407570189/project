package com.black;

import java.util.ArrayList;
import java.util.List;

public class List1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(11);
		list.add(8);
		list.add(4);
		list.add(9);
		list.add(5);
		list.add(7);
		list.add(9);
		list.add(3);
		for (int i=0; i<list.size(); i++) {
		    if (i % 1 == 0)
		        list.remove(i);
		}
		System.out.println(list);
}
}
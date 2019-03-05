package com.black;

import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;


public class Hello {

	public static void main(String[] args) {
		List<Integer> bag = new ArrayList<>();
		bag.add(3);
		bag.add(8);
		bag.add(8);
		bag.add(3);
		System.out.print(bag);

		HashSet p =new HashSet();
		p.add(8);
		p.add(7);
		
		p.add(7);
		System.out.print(p);
	}

}

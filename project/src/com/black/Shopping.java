package com.black;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shopping {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input item:");
		String name = scanner.nextLine();
		System.out.println("The item's price:");
		int price = scanner.nextInt();
		list.add(name);
		list2.add(price);
		System.out.println(name+" "+price+"dollar");
		

	}

}

package com.black;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Item {

	List<Item> items = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	
	public void input(){
		
		while(true){
		
		System.out.println("Please input 1or2:");
		 int p = scanner.nextInt();
		 if(p==2){
			 break;
		 }
		scanner.nextLine();
		System.out.println("Please input item:");
		String name= scanner.nextLine();
		System.out.println("The item's price:");
		int price = scanner.nextInt();
		scanner.nextLine();
		
		
		for(Item item:items){
			System.out.println(name+" "+price+"dollar");
		}
		
      
		}
	 }
	
	}



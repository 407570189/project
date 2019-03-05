package com.black;

import java.util.HashSet;

public class Set1 {

	public static void main(String[] args) {
		System.out.println("PokerGame:little to large");
		HashSet<Integer> poker =new HashSet();
		for(int i =1;i<=13;i++){
		poker.add(i);
		System.out.print(i+" ");
		}

	}

}

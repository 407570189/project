package com.black;

import java.util.ArrayList;
import java.util.List;

public class List1 {

	public static void main(String[] args) {
		List<String> grade = new ArrayList<>();
		grade.add("國文:"+87+"分");
		grade.add("英文:"+77+"分");
		grade.add("數學:"+87+"分");
	    System.out.println("My final text's grade");
        System.out.println(grade);
	}

}

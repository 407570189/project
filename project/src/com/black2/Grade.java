package com.black2;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入數學成績");
		int math =Integer.parseInt(scanner.nextLine());
		System.out.println("請輸入英文成績");
		int english =Integer.parseInt(scanner.nextLine());
		int average = (english+math)/2;
		System.out.println("總平均:"+average);
	}

}

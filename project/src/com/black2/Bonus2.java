package com.black2;

import java.util.Scanner;

public class Bonus2 {

	public static void main(String[] args) {
		int bonus =200000;
		int div =0;
		Scanner scanner = new Scanner(System.in);
			System.out.println("多少人要分?");
			String number = scanner.nextLine();
		try {
			int n=Integer.parseInt(number);
			div=bonus/n;
		}catch(ArithmeticException e) {
			System.out.println("數值運算錯誤");
		}catch(NumberFormatException e) {
			System.out.println("數字格式錯誤");
		}
		System.out.println("每個人的所得"+div);
	}

}

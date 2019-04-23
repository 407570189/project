package com.black2;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("多少人分50000");	
    int bonus =50000;
    int div =scanner.nextInt();
    scanner.nextLine();
    System.out.println("每個人得"+bonus/div);
	}

}

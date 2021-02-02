package com.math01;

import java.util.Scanner;

public class Main1712 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int fixed = sc.nextInt();
		int cost = sc.nextInt();
		int price = sc.nextInt();

		if (price <= cost) {
			System.out.println("-1");
		} else {
			System.out.println((fixed / (price - cost)) + 1);
		}
		
	}	
}

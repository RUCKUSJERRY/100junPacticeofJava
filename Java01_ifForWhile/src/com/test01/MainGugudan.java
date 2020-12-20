package com.test01;

import java.util.Scanner;

public class MainGugudan {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		
		for (int j = 1; j < 10; j++) {
			System.out.println(a + " * " + j + " = " + (a * j));
		}
		
	}
	
	
}

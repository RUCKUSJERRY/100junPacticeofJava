package com.math02;

import java.util.Scanner;

public class Main1011 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int a = y - x;
		int k = 1;
		 
		while (a > 0) {
			System.out.println(a);
			System.out.println(k);
			a -= k;
			k++;
			
		}
		
		
		
	}
	
}

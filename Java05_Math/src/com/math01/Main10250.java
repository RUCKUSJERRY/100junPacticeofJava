package com.math01;

import java.util.Scanner;

public class Main10250 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			
			int h = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();
			
			int floor = 0;
			if ((n % h) == 0) {
				floor = h;
			} else {
				floor = (n % h);
			}
			
			int room = 0;
			if ((n % h) == 0) {
				room = (n / h);
			} else {
				room = (n / h) + 1;
			}
			
			System.out.println((n % h));
			System.out.println((n / h) + 1);
			
			String res = "";
			res += floor;
			if (room < 10) {
				res += "0";
				res += room;
			} else {
				res += room;
			}
			System.out.println(res);
		}
		
	}
	

	
}

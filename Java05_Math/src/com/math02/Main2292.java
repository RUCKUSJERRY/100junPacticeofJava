package com.math02;

import java.util.Scanner;

public class Main2292 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int cnt = 1;
		int max = 1;
		
		do {
			
			if (n == 1) {	
				break;
			} else {
				max += (6 * cnt);
				cnt++;
				System.out.println(max);
			}
			
		} while (max < n);
		
		System.out.println(cnt);
		
		// 1 = 1
		// 2 ~ 7 = 2		6
		// 8 ~ 19 = 3		12
		// 20 ~ 37 = 4		18
		// 38 ~ 61 = 5		24
		// 62 ~ 91 = 6		30
		// 92 ~ 127 = 7		36 42 48
		
	}
	
}

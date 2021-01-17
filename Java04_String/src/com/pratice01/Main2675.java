package com.pratice01;

import java.util.Scanner;

public class Main2675 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			String a = sc.next();
			for (int j = 0; j < a.length(); j++) {
				for (int j2 = 0; j2 < a.length(); j2++) {
					System.out.print(a.charAt(j));
				}
				
			}
			
		}
		
	}
	
}

package com.pratice01;

import java.util.Scanner;

public class Main10809 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		a.toLowerCase();
		
		for (int i = 97; i < 123; i++) {
			
			char b = 0;
				 b += i;

			System.out.print(a.indexOf(b) + " ");
			b = 0;
		}
		
	}
	
}

package com.pratice01;

import java.util.Scanner;

public class Main2908 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		int c = 0;
		int d = 0;

		if (a.equals(b) || a.length() != 3 || b.length() != 3) {
			System.out.println("잘못입력하였습니다.");
		} else if (a.charAt(0) == '0' | a.charAt(1) == '0' | a.charAt(2) == '0' | b.charAt(0) == '0'
				| b.charAt(1) == '0' | b.charAt(2) == '0') {
			System.out.println("잘못입력하였습니다.");
		} else {
			c = reverse(a);
			d = reverse(b);
			
			if (c > d) {
				System.out.println(c);
			} else {
				System.out.println(d);
			}

		}
		
		
		
		
		

	}
	
	public static int reverse(String s) {
		
		int res = 0;
		
		res += Character.getNumericValue(s.charAt(2)) * 100;
		res += Character.getNumericValue(s.charAt(1)) * 10;
		res += Character.getNumericValue(s.charAt(0));
		
		
		
		return res;
	}

}

package com.test01;

import java.util.Scanner;

public class MainAlarm {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		

		int h = sc.nextInt();
		int m = sc.nextInt();

		int hm = ((h * 60) + m) - 45;

		if (hm < 0) {
			int ah = 23;
			int am = m - 45 + 60;
			System.out.println(ah + " " + am);
		} else {
			int ah = hm / 60;
			int am = hm % 60;
			System.out.println(ah + " " + am);
		}

	}
}
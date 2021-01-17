package com.fx01;

import java.util.Scanner;

public class Main1065 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= n; i++) {

			if (numberOfHan(i) == true) {
				count++;
			}

		}

		System.out.println(count);

	}

	public static boolean numberOfHan(int n) {

		boolean res = false;

		if (n < 100) {
			res = true;
		} else if (n >= 100 && n < 1000) {

			String s = Integer.toString(n);

			if ((s.charAt(2) - s.charAt(1)) == (s.charAt(1) - s.charAt(0))) {
				res = true;
			}

		} else {
			res = false;
		}

		return res;

	}

}

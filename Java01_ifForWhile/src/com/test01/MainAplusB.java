package com.test01;

import java.util.Scanner;

public class MainAplusB {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("level을 입력해주세요.");
		int a = sc.nextInt();

		Integer[] x = new Integer[a];
		Integer[] y = new Integer[a];
		Integer[] z = new Integer[a];
		for (int i = 0; i < x.length; i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			x[i] = b + c;
			y[i] = b;
			z[i] = c;
		}

		for (int i = 0; i < x.length; i++) {

			System.out.printf("Case #%d: %d + %d = %d\n", (i + 1), y[i], z[i], x[i]);

		}

	}

}

package com.test01;

import java.util.Scanner;

public class MainAplusB {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("level�� �Է����ּ���.");
		int a = sc.nextInt();
		
		
		for (int i = 0; i < a; i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			System.out.println(b + c);
		}
		
	}

}

package com.test01;

import java.util.Scanner;

public class MainWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//boolean test = true;
		while (sc.hasNextInt()) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			//if (a == 0 || b == 0) {
			//	test = false;
			//	break;
			//} else {
				System.out.println(a + b);
			//}
			
		}

	}

}

package com.pratice01;

import java.util.Scanner;

class Main5622 {

//	public static int getSec(String s) {
//
//		int sec = 0;
//
//		for (int i = 0; i < s.length(); i++) {
//			sec += Character.getNumericValue(s.charAt(i)) + 1;
//		}
//
//		return sec;
//
//	}

	public static int getSec(String s) {

		int num = 0;

		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {
			case 'A': case 'B': case 'C':
				num += 3;
				break;
			case 'D':
			case 'E':
			case 'F':
				num += 4;
				break;
			case 'G':
			case 'H':
			case 'I':
				num += 5;
				break;
			case 'J':
			case 'K':
			case 'L':
				num += 6;
				break;
			case 'M':
			case 'N':
			case 'O':
				num += 7;
				break;
			case 'P':
			case 'Q':
			case 'R':
			case 'S':
				num += 8;
				break;
			case 'T':
			case 'U':
			case 'V':
				num += 9;
				break;
			case 'W':
			case 'X':
			case 'Y':
			case 'Z':
				num += 10;
				break;
			}
		}

		return num;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String a = sc.next().toUpperCase();

		if (a.length() < 2 || a.length() > 16) {
			System.out.println("잘못 입력하셨습니다.");
			
		} else {

			int time = getSec(a);

			System.out.println(time);
		}

	}

}

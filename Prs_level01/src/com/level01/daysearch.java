package com.level01;

public class daysearch {

	public static void main(String[] args) {

		int a = 12;
		int b = 31;

		solution(a, b);

	}

	public static String solution(int a, int b) {
		String answer = "";

		int day = 0;

		// 월 더하기
		for (int i = 1; i < a; i++) {
			
			switch (i) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				day += 31;
				break;
			case 2:
				day += 29;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				day += 30;
				break;
			}
			System.out.println(i + " : " + day);
		}
		
		// 일 더하기
		day += b;
		
		int res = day % 7;
		
		switch (res) {
		case 1:
			answer = "FRI";
			break;
		case 2:
			answer = "SAT";
			break;
		case 3:
			answer = "SUN";
			break;
		case 4:
			answer = "MON";
			break;
		case 5:
			answer = "TUE";
			break;
		case 6:
			answer = "WED";
			break;
		case 0:
			answer = "THU";
			break;

		}
		
		System.out.println(day);
		System.out.println(res);
		System.out.println(answer);
		return answer;
	}

}

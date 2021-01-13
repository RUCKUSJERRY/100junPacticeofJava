package com.commit01;

import java.util.Scanner;

public class entNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("개미수열");
		System.out.println("몇줄을 출력하시겠습니까?");
		int n = sc.nextInt();
		
		String line = "1";
		String next = "";
		
		// nextLine 메소드 -> 다음라인의 값을 String으로 출력해주는거
		// numberCnt -> 1이 몇개인지 2가 몇개인지 3이 몇개인지 그때그때 스트링으로 출력해서 nextLine 메소드로 보내주는 메소드
		
		
		for (int i = 0; i < n; i++) {
			System.out.println(line);
			next = nextLine(line);
			line = next;
			
		}
		
	}
	// 다음 라인을 출력하는 메소드
	public static String nextLine(String line) {
	
		String next = ""; 
		for (int i = 0; i < line.length(); i++) {
			if (i > 0) {
				if (line.charAt(i) == line.charAt(i-1)) {
					continue;
				}
			}				
			next += numberCnt(line, i);
		}
		
		return next;
	}
	
	// 숫자를 세서 출력하는 메소드
	public static String numberCnt(String line, int n) {
		
		char str = line.charAt(n);
		int count = 0;
		
		for (int i = n; i < line.length(); i++) {
			if (str == line.charAt(i)) {
				count++;
			} else {
				break;
			}
		}
		
		return str + Integer.toString(count);
	}
	
}

package com.commit01;

import java.util.Scanner;

public class entNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("개미수열");
		System.out.println("몇줄을 출력하시겠습니까?");
		int n = sc.nextInt();
		
		String line = "1"; // 시작...
		String next = ""; // 다음라인?....
		
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
	
	/*
	 * 메인메소드
	 * 스캐너
	 * 몇줄인지 받어
	 * int n = sc.nextInt();
	 * 
	 * String line = "12";
	 * String next = "12";
	 * 
	 * for (int i = 0; i < n; i++){
	 * 		next = nextline(line);
	 * 		line = next;
	 *	}
	 *
	 */
	 
	
	// 
	
	// 1이 1개  "11" -> 리턴 메소드 String nextLine(String line) { 
	
	//	return }
	
	// 숫자를 세주는 메소드,,?
	
	// 
	
	
	
}

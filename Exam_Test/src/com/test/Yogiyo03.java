package com.test;

public class Yogiyo03 {

	public static void main(String[] args) {

		int n = 3298;
		
		solution(n);
		
	}
	
	public static int solution(int n) {
		
		int res = n + 1;
		
		while(!checkSame(res)) {
			res++;
		}
		System.out.println(res);
		return res;
		
	}
	
	public static boolean checkSame(int n) {
		
		String a = Integer.toString(n);
		// 숫자를 문자열로 변환 한다.
		for (int i = 0; i < a.length()-1; i++) {
			
			if (a.charAt(i) == a.charAt(i+1)) {
				return false;
			}
			
		}

		return true;
	}
	
}

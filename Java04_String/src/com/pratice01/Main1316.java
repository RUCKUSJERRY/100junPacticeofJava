package com.pratice01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1316 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String group = "";

		for (int i = 0; i < n; i++) {
			group += br.readLine();
		}

		StringTokenizer st = new StringTokenizer(group);
		int count = 0;
		while (st.hasMoreTokens()) {
			if (cntGroup(st.nextToken())) {
				count++;
			}
		}
		
		System.out.println(count);
		
	}
	
	public static boolean cntGroup(String s) {
		boolean res = true;
		
		for (int i = 97; i < 123; i++) {
			char at = 0;
			at += i;
			
			int start = 0;
			char again = 0;
			
			// 첫번째 같은 문자 찾기
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(i) == at) {
					again = at;	
					start = j;
					break;
				}
			}
			// 중복이 멈추는 부분
			for (int j = start; j < s.length(); j++) {
				if (s.charAt(j) != again) {
					start = j;
					break;
				}
			}
			
			for (int j = start; j < s.length(); j++) {
				if (s.charAt(j) == again) {
					return false;
				}
			}
			
		}
		
		return res;
	}

}

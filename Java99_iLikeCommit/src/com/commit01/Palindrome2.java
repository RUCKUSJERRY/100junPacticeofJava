package com.commit01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean res = false;
		
		// true 일때까지 반복해서 입력하게 하기
		while (res != true) {
		
		String in = br.readLine();
		String out = "";
		
		// 입력된 값을 거꾸로 출력
		for (int i = in.length() - 1; i >= 0; i--) {
			out += in.charAt(i);
		}	
		// 기존값과 거꾸로 값을 비교
		// true or false 리턴
			if (in.equals(out)) {
				res = true;
				System.out.println(res + "!! 회문입니다.");
				break;
			} else {
				System.out.println(res + "!! 회문이 아닙니다. 다시 입력해주세요.");
				res = false;
				
			}
		}
		
		
	}
	
}

package com.pratice01;

import java.util.Arrays;
import java.util.Scanner;

public class Main1157 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String text = sc.next().toUpperCase();
		
		// 알파벳 횟수 배열 생성
		char res[] = new char[26];
		int cnt[] = new int[26];
		int plus = 0;
		for (int i = 65; i < 91; i++) {
			res[plus] += i;
			cnt[plus] = cntAl(text, i);
			plus++;
		}

		System.out.println(Arrays.toString(res));
		System.out.println(Arrays.toString(cnt));
		int max = 0;
		int prn = 0;
		int re = 0;
		
		// 최대값 출력
		for (int i = 0; i < cnt.length; i++) {
			if (max < cnt[i]) {
				max = cnt[i];
				prn = i;

			}
		}
		
		// 최대값 중복 검사
		for (int i = 0; i < cnt.length; i++) {
			if (cnt[i] == max && cnt[i] > 0) {
				re++;
			}
		}

		if (re >= 2) {
			System.out.println("?");
		} else {
			char result = 'A';
			result += prn;
			System.out.println(result);
		}	

	}

	public static int cntAl(String s, int n) {

		int cnt = 0;
		char temp = 0;
		temp += n;
		for (int i = 0; i < s.length(); i++) {
			char res = s.charAt(i);
			if (res == temp) {
				cnt++;
			}

		}

		return cnt;
	}

}

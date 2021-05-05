package com.level01;

import java.util.Arrays;

public class stringSort {

	public static void main(String[] args) {
		String[] a = { "aa", "bc", "bb", "ba", "cc" };
		System.out.println(Arrays.toString(a));
		Arrays.sort(a, 1, 3);
		System.out.println(Arrays.toString(a));

		String[] s = { "cba", "bac", "acb", "abc" , "bca", "cab" , "dab" , "baa"};
		
		int n = 1;

		solution(s, n);

	}

	public static String[] solution(String[] strings, int n) {

		String[] answer = new String[strings.length];

		String[] temp = new String[strings.length];
		
		for (int i = 0; i < temp.length; i++) {
			temp[i] = strings[i].charAt(n) + strings[i];
		}
		
		Arrays.sort(temp);
		
		for (int i = 0; i < temp.length; i++) {
			answer[i] = temp[i].substring(1);
		}
		
		System.out.println(Arrays.toString(answer));
		return answer;
	}
//	temp = answer[j];
//	answer[j] = answer[i];
//	answer[i] = temp;
	

}

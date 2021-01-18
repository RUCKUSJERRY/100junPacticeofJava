package com.pratice01;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main1152 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(s, " ");
		int res = st.countTokens();
		
		while (st.hasMoreTokens()) {
			System.out.println(res);
			System.out.println(st.nextToken());
		}
		
		//String[] a = s.split(" ");
//		System.out.println(Arrays.toString(a));
		
//		if (a[0].equals("")) {
//			System.out.println(a.length - 1);
//		} else {
//			System.out.println(a.length);
//		}
		
		
		
	}
	
}

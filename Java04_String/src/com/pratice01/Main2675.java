package com.pratice01;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main2675 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		String a = "";

		for (int i = 0; i < n * 2; i++) {

			if (i % 2 == 0) {
				a += sc.nextInt() + " ";
			} else {
				a += sc.next() + " ";
			}

		}

		StringTokenizer st = new StringTokenizer(a, " ");
		int tkn = st.countTokens();

		for (int i = 0; i < tkn; i++) {
			String token = "";
			int cnt = 0;
			String res = "";
			if (i % 2 == 0) {
				cnt = Integer.parseInt(st.nextToken());
				token = st.nextToken();
			} else {
				continue;
			}

			for (int j = 0; j < token.length(); j++) {
				for (int k = 0; k < cnt; k++) {
					res += token.charAt(j);
				}
				
			}
			System.out.println(res);
		}

	}

}

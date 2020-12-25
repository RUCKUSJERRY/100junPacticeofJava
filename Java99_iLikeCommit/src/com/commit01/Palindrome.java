package com.commit01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {

	public static void main(String[] args) throws IOException {

		boolean res = false;

		while (res != true) {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuilder sb = new StringBuilder();
			String in = br.readLine();
			String rev = sb.append(in).reverse().toString();
			
			if (in.equals(rev)) {
				res = true;
				System.out.println(res);
				break;
			} else {
				res = false;
				System.out.println(res + ": 회문이 아닙니다. 다시입력해주세요.");
			}

		}

	}

}

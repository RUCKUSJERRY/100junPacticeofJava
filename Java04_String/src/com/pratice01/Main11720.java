package com.pratice01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main11720 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		String b = br.readLine();
		int res = 0;
		
		if (b.length() != a) {
			System.out.println("잘못 입력하였습니다.");
		} else {
			
			for (int i = 0; i < a; i++) {			
				int d = Character.getNumericValue(b.charAt(i));
				res += d;
				
			}
			
			System.out.println(res);

		}
			
		}
		
		
		
		

}

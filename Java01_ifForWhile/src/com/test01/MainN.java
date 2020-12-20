package com.test01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MainN {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= a; i++) {
			System.out.println(i);
		}
		
		for (int i = a; i > 0; i--) {
			System.out.println(i);
		}
		
		
	}
	
	
}

package com.test01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		for (int i = 1; i <= n; i++) { // 0 1 2 3 4 5
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

}

/*
 * for (int i = 0; i < n; i++) { for (int j = 0; j <= i; j++) {
 * System.out.print("*"); } System.out.println(); } br.close();
 */

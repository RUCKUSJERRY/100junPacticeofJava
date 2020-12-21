package com.test01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainWhileCycle {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		if (n < 10) {
			n *= 10;
		} else if (n < 0 || n >= 100) {
			System.out.println("범위 초과입니다.");
		}
		int count = 0;
		int x = n;
		int y = 0;
		
		while (true) {
			y = ((x % 10) * 10) + (((x / 10) + (x % 10)) % 10); // 68
			x = y;
			count++;
			if (y == n) {
				break;
			}
		}
		System.out.println(count);
		br.close();
	}

}

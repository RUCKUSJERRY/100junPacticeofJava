package com.math02;

import java.util.Scanner;

public class Main1193 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int cnt = 1;
		int x = 0;
		int y = 0;
		
		do {
			
			if (n == 1) {
				break;
			} else {
				n = n - cnt;
				cnt++;
			}
			
			
			
			
		} while (n > cnt);
		
		System.out.println(n);
		System.out.println(cnt);
		
		x = cnt; // ����
		y = cnt; // ����
		
		if (x % 2 == 1) {
			y = 1;			
			for (int i = 1; i < n; i++) {
				x--;
				y++;
			}
			
		} else if (x % 2 == 0){
			x = 1;			
			for (int i = 1; i < n; i++) {
				y--;
				x++;
			}			
		}
		
		System.out.println(x + "/" + y);
		
	}
	
}

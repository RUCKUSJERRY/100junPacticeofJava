package com.pratice01;

import java.util.Scanner;

public class Main2941 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();

		int count = 0;

		for (int i = 0; i < a.length(); i++) {

			char c = a.charAt(i);
			
			if (i < a.length()-1) {
				if (c == 'c') {
					if (a.charAt(i + 1) == '=' || a.charAt(i + 1) == '-') {
						i++;
					}
				} else if (c == 'd') {
					if (a.charAt(i + 1) == 'z') {
						if (i < a.length()-2 && a.charAt(i + 2) == '=') {
							i++;
							i++;	
						}
						 
					} else if (a.charAt(i + 1) == '-') {
						i++;
					}
				} else if (c == 'l' || c == 'n') {
					if (a.charAt(i + 1) == 'j') {
						i++;
					}
				} else if (c == 's' || c == 'z') {
					if (a.charAt(i + 1) == '=') {
						i++;
					}

				}	
			}
			
			count++;

		}
		System.out.println(count);
	}

}

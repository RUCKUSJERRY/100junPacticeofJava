package com.commit01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class randomRemind {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("로또 생성기");
		System.out.println("몇 줄을 생성하시겠습니까?");
		int n = 0;
		
		try {
			n = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		int arr[][] = new int[n][6];
		int number = 0;
	
		// 배열에 숫자 넣기
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < 6; j++) {
				number = (int) (Math.random() * 44) + 1;
				arr[i][j] = number;
				for (int k = 0; k < j; k++) {
					if (arr[i][j] == arr[i][k]) {
						j--;
					}
				}
				
			}
			Arrays.sort(arr[i]);
		}
		
		
		// 배열에 넣은 숫자 출력하기
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}

	}

}

package com.test01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MainLessthan {

	public static void main(String[] args) throws IOException {

//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		// 유사 스캐너
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		// 토큰 문자열을 짤라서 넣어주는????
//		int n = Integer.parseInt(st.nextToken());
//		int m = Integer.parseInt(st.nextToken());
//		// 입력한 값을 토큰에 넣어준다.
//		st = new StringTokenizer(br.readLine());
//		
//		for (int i = 0; i < n; i++) {
//			int tmp = Integer.parseInt(st.nextToken());
//			
//			if (tmp < m) {
//				System.out.print(tmp + " ");
//			}
//		}
//		br.close();
//	}
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 10
		int x = sc.nextInt(); // 5
		
		int []arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] < x) {
				System.out.print(arr[i] + " ");
			}
		}
		
//		for (int i = 0; i < n; i++) {
//			int temp = sc.nextInt();
//			// 1 10 4 9 2 3 8 5 7 6
//			if (temp < x) {
//				System.out.print(temp + " ");
//			}
//		}
//		sc.close();
	}

}

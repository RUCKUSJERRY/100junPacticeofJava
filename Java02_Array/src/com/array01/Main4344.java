package com.array01;

import java.util.Scanner;

/*
 * 첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
 * 둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 
 * 이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
 * 
 * 각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
 */

public class Main4344 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int n = sc.nextInt();

		double[][] arr = new double[n][];
		double[] avg = new double[n]; // 반평균
		double[] res = new double[n];// 반평균의 평균이상 학생의 퍼센트
		// 숫자 넣기
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new double[sc.nextInt() + 1];
			arr[i][0] = arr[i].length - 1;

			for (int j = 1; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
			// 반평균 산출
			
			for (int k = 1; k < arr[i].length; k++) {
				avg[i] += arr[i][k];
				if (k == arr[i].length - 1) {
					avg[i] = avg[i] / arr[i][0];
				}
			}
			// 반평균을 넘는 학생의 숫자 산출 
			int count = 0;
			for (int j = 1; j < arr[i].length; j++) {
				
				if (arr[i][j] > avg[i]) {
					count++;
				}		
			}
			res[i] = count / arr[i][0] * 100;
			count = 0;
		}
		
		for (int i = 0; i < res.length; i++) {
			System.out.printf("%.3f%%\n", res[i]);
		}

	}

}

package com.math01;

import java.util.Arrays;
import java.util.Scanner;

public class Main2775 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			
			int k = sc.nextInt();
			int n = sc.nextInt();
			
			int [][] arr = new int [k+1][n];
			
			
			
			for (int j = 0; j < arr.length; j++) {

				if (j == 0) {
					// 0���� �� ���� ä���
					int set = 1;
					for (int z = 0; z < arr[j].length; z++) {
						arr[j][z] = set;
						System.out.print(arr[j][z] + " ");
						set++;
					}
					System.out.println();
				} else {
					// �ؿ� ���� �ֵ� ���ϸ鼭 ���� ����ֱ�.

					for (int m = 0; m < arr[j].length; m++) {
						if (m == 0) {
							arr[j][m] = arr[j-1][m];
							System.out.print(arr[j][m] + " ");
						} else if (m >= 1 ) {
							arr[j][m] = arr[j-1][m] + arr[j][m-1];
							System.out.print(arr[j][m] + " ");
						}
						
					}
					System.out.println();
				}
			}
			System.out.println(Arrays.deepToString(arr));
				System.out.println(arr[k][n-1]);
		}
		
	}
	
}

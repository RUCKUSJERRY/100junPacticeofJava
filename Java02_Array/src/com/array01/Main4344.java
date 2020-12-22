package com.array01;

import java.util.Scanner;

/*
 * ù° �ٿ��� �׽�Ʈ ���̽��� ���� C�� �־�����.
 * ��° �ٺ��� �� �׽�Ʈ ���̽����� �л��� �� N(1 �� N �� 1000, N�� ����)�� ù ���� �־�����, 
 * �̾ N���� ������ �־�����. ������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.
 * 
 * �� ���̽����� �� �پ� ����� �Ѵ� �л����� ������ �ݿø��Ͽ� �Ҽ��� ��° �ڸ����� ����Ѵ�.
 */

public class Main4344 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int n = sc.nextInt();

		double[][] arr = new double[n][];
		double[] avg = new double[n]; // �����
		double[] res = new double[n];// ������� ����̻� �л��� �ۼ�Ʈ
		// ���� �ֱ�
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new double[sc.nextInt() + 1];
			arr[i][0] = arr[i].length - 1;

			for (int j = 1; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
			// ����� ����
			
			for (int k = 1; k < arr[i].length; k++) {
				avg[i] += arr[i][k];
				if (k == arr[i].length - 1) {
					avg[i] = avg[i] / arr[i][0];
				}
			}
			// ������� �Ѵ� �л��� ���� ���� 
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

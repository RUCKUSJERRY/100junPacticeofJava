package com.array01;

import java.util.Arrays;
import java.util.Scanner;

public class Main1546 {

	/*
	 * �����̴� �⸻��縦 ���ƴ�. �����̴� ������ �����ؼ� ���� ��������� �ߴ�. �ϴ� �����̴� �ڱ� ���� �߿� �ִ��� �����. �� ����
	 * M�̶�� �Ѵ�. �׸��� ���� ��� ������ ����/M*100���� ���ƴ�. ���� ���, �������� �ְ����� 70�̰�, ���������� 50�̾�����
	 * ���������� 50/70*100�� �Ǿ� 71.43���� �ȴ�. �������� ������ ���� ������ ���� ������� ��, ���ο� ����� ���ϴ� ���α׷���
	 * �ۼ��Ͻÿ�.
	 */
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int n = sc.nextInt();
		double[] arr = new double[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		Arrays.sort(arr);
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] / arr[arr.length - 1] * 100;
			sum += arr[i];

		}
		System.out.println((double) (sum / n));

	}
}

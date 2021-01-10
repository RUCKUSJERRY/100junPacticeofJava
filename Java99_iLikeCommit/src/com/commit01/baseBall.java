package com.commit01;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class baseBall {

	/*
	 * �߱��̴ϸ�ŭ �߱� �� �����Ѵ�. ���� "9ȸ�� 2�ƿ�"�� �ٰ��� ���� ���� Ƚ���� 9������ �����ϴ� ��찡 ������, ��κ��� �����
	 * ��� �� ���� ������.
	 * 
	 * ���� 3/4�ڸ��� ���ڸ� ���Ƿ� ���� ��, ���ο��� 3/4�ڸ��� ���ڸ� �ҷ��� ����� Ȯ���Ѵ�. �׸��� �� ����� ���� ��밡 ����
	 * ���ڸ� ������ �� ������ ���Ǵ� ���ڴ� 0���� 9���� ���� �ٸ� �����̴�. ��쿡 ���� 0�� ������� �ʱ⵵ �Ѵ�. ���ڴ� ������ ��ġ��
	 * Ʋ���� ���� ��. ���ڿ� ��ġ�� ���� ������ ��Ʈ����ũ. ���ڿ� ��ġ�� ���� Ʋ���� �ƿ�. "Ʋ�ȴ�"�� �� �߿��ϴ�. �ǿܷ� �ƿ��� ����
	 * ���� ���ε�, Ʋ�� ���ڸ� ������ ���� ���ڳ��� �����ϸ� �ǹǷ� ����� ���� ���� �پ��� ����. ��, ��Ʈ����ũ�� ���ڴ� �´� �� ������
	 * ���� ���ڰ� �¾Ҵ����� �� ���� ���� ����� ���� �� �����غ��� ������ �ƿ��� Ʋ�� ���ڸ� ������ �������� �����غ��� ����� �ʱ� ����.
	 * 2�ƿ��� ������ ���� ����. �����ϰ� ���� ������ �̻��ϰ� ���� �ʴ� �̻� 3�ƿ� �̻��� ����� ������ �ʴ´�. ���� ������ ���̰�
	 * ��Ʈ����ũ������ �˷����� �ʴ´�. �� ���ڰ� �ߺ��Ǹ� ����� ���� �������� �׷��� �ߺ� ���ڴ� �� ������� �ʴ´�.
	 * 
	 */
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("���� �߱� ����");
		System.out.println("�� �ڸ��� ���� �ҷ�? (3 or 4 �Է�)");
		int n = sc.nextInt();
		int arr[] = new int[n];
		Random rd = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(9);
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
				}
			}
		}

		if (n == 3) {
			int strike = 0;
			int ball = 0;
			int out = 0;
			int count = 1;
			boolean res = false;
			do {
				System.out.println("0 ~ 9 �߿� 3���� ���ڸ� �Է����ּ���.");
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				
				if (arr[0] == a) {
					strike++;
				} else if (arr[1] == a || arr[2] == a) {
					ball++;
				} else {
					out++;
				}

				if (arr[1] == b) {
					strike++;
				} else if (arr[0] == b || arr[2] == b) {
					ball++;
				} else {
					out++;
				}

				if (arr[2] == c) {
					strike++;
				} else if (arr[0] == c || arr[1] == c) {
					ball++;
				} else {
					out++;
				}
				
				if (strike == 3) {
					System.out.println("3 ��Ʈ����ũ!!!");
					res = true;
				} else {
					System.out.printf("%1d ��Ʈ����ũ, %1d ��, %1d �ƿ� \n", strike, ball, out);
					count++;
					strike = 0;
					ball = 0;
					out = 0;
				}
				
			} while (res == false);
			
			System.out.println(count + "�� ���� �����Դϴ�.");
			System.out.println("���� : " + Arrays.toString(arr));

		} else {
			int strike = 0;
			int ball = 0;
			int out = 0;
			int count = 0;
			boolean res = false;
			do {
				System.out.println("0 ~ 9 �߿� 4���� ���ڸ� �Է����ּ���.");
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				int d = sc.nextInt();
				
				if (arr[0] == a) {
					strike++;
				} else if (arr[1] == a || arr[2] == a || arr[3] == a) {
					ball++;
				} else {
					out++;
				}

				if (arr[1] == b) {
					strike++;
				} else if (arr[0] == b || arr[2] == b || arr[3] == b) {
					ball++;
				} else {
					out++;
				}

				if (arr[2] == c) {
					strike++;
				} else if (arr[0] == c || arr[1] == c || arr[3] == c) {
					ball++;
				} else {
					out++;
				}
				
				if (arr[3] == d) {
					strike++;
				} else if (arr[0] == d || arr[1] == d || arr[2] == d) {
					ball++;
				} else {
					out++;
				}
				
				if (strike == 4) {
					System.out.println("4 ��Ʈ����ũ!!!");
					res = true;
				} else {
					System.out.printf("%1d ��Ʈ����ũ, %1d ��, %1d �ƿ� \n", strike, ball, out);
					count++;
					strike = 0;
					ball = 0;
					out = 0;
				}
				
			} while (res == false);
			
			System.out.println(count + "�� ���� �����Դϴ�.");
			System.out.println("���� : " + Arrays.toString(arr));
			
		}

	}

}

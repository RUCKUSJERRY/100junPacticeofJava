package com.commit02;

import java.util.Random;
import java.util.Scanner;

public class killVulture {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("지뢰찾기");
		System.out.println("몇 줄을 출력하시겠습니까?");
		int n = sc.nextInt();

		int map[][] = new int[n][n];

		Random ran = new Random();

		// 지뢰심기

		for (int i = 0; i < n; i++) {

			map[ran.nextInt(n)][ran.nextInt(n)] = n + 1;

		}

		// 심은 지뢰 보기
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				System.out.printf("%3s", map[i][j]);
			}
			System.out.println();
		}

		System.out.println();

		// 지뢰찾기
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (map[i][j] > n) {

					if (i == 0 && j == 0) {
						map[i][j + 1] += 1;
						map[i + 1][j] += 1;
						map[i + 1][j + 1] += 1;

					} else if (i > 0 && i < n - 1 && j == 0) {
						map[i - 1][j] += 1;
						map[i - 1][j + 1] += 1;
						map[i][j + 1] += 1;
						map[i + 1][j + 1] += 1;
						map[i + 1][j] += 1;

					} else if (i == n - 1 && j == 0) {
						map[i - 1][j] += 1;
						map[i - 1][j + 1] += 1;
						map[i][j + 1] += 1;

					} else if (i == 0 && j == n - 1) {
						map[i][j - 1] += 1;
						map[i + 1][j - 1] += 1;
						map[i + 1][j] += 1;

					} else if (i == 0 && j > 0 && j < n - 1) {
						map[i][j - 1] += 1;
						map[i][j + 1] += 1;
						map[i + 1][j + 1] += 1;
						map[i + 1][j - 1] += 1;
						map[i + 1][j] += 1;

					} else if (i > 0 && i < n - 1 && j == n - 1) {
						map[i - 1][j] += 1;
						map[i - 1][j - 1] += 1;
						map[i][j - 1] += 1;
						map[i + 1][j - 1] += 1;
						map[i + 1][j] += 1;

					} else if (i == n - 1 && j > 0 && j < n - 1) {
						map[i][j - 1] += 1;
						map[i - 1][j - 1] += 1;
						map[i - 1][j] += 1;
						map[i - 1][j + 1] += 1;
						map[i][j + 1] += 1;

					} else if (i == n - 1 && j == n - 1) {
						map[i - 1][j] += 1;
						map[i - 1][j - 1] += 1;
						map[i][j - 1] += 1;

					} else {

						map[i - 1][j - 1] += 1;
						map[i - 1][j] += 1;
						map[i - 1][j + 1] += 1;
						map[i][j - 1] += 1;
						map[i][j + 1] += 1;
						map[i + 1][j - 1] += 1;
						map[i + 1][j] += 1;
						map[i + 1][j + 1] += 1;
					}

				}

			}

		}

		// 지뢰숫자 통일시키기
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				if (map[i][j] > n + 1) {
					map[i][j] = n + 1;
				}
			}
		}

		String res[][] = new String[n][n];

		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res.length; j++) {

				if (map[i][j] == n + 1) {
					res[i][j] = "*";
				} else {
					res[i][j] = Integer.toString(map[i][j]);
				}
				System.out.printf("%3s", res[i][j]);
			}
			System.out.println();
		}

	}

}

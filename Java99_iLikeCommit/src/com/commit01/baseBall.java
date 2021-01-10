package com.commit01;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class baseBall {

	/*
	 * 야구이니만큼 야구 용어가 등장한다. 또한 "9회말 2아웃"에 근거해 숫자 제시 횟수를 9번까지 제한하는 경우가 있으며, 대부분의 사람의
	 * 경우 그 전에 끝난다.
	 * 
	 * 각자 3/4자리의 숫자를 임의로 정한 뒤, 서로에게 3/4자리의 숫자를 불러서 결과를 확인한다. 그리고 그 결과를 토대로 상대가 적은
	 * 숫자를 예상한 뒤 맞힌다 사용되는 숫자는 0에서 9까지 서로 다른 숫자이다. 경우에 따라 0은 사용하지 않기도 한다. 숫자는 맞지만 위치가
	 * 틀렸을 때는 볼. 숫자와 위치가 전부 맞으면 스트라이크. 숫자와 위치가 전부 틀리면 아웃. "틀렸다"는 게 중요하다. 의외로 아웃이 제일
	 * 좋은 수인데, 틀린 숫자만 제끼고 남은 숫자끼리 조합하면 되므로 경우의 수가 팍팍 줄어들기 때문. 볼, 스트라이크는 숫자는 맞는 게 있으나
	 * 무슨 숫자가 맞았는지를 알 수가 없어 경우의 수를 더 생각해봐야 하지만 아웃은 틀린 숫자만 제거한 나머지만 생각해보면 어렵지 않기 때문.
	 * 2아웃이 나오면 더욱 좋다. 작정하고 숫자 예측을 이상하게 하지 않는 이상 3아웃 이상은 절대로 나오지 않는다. 물론 무엇이 볼이고
	 * 스트라이크인지는 알려주지 않는다. 두 숫자가 중복되면 경우의 수가 많아져서 그런지 중복 숫자는 잘 사용하지 않는다.
	 * 
	 */
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("숫자 야구 게임");
		System.out.println("몇 자리로 게임 할래? (3 or 4 입력)");
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
				System.out.println("0 ~ 9 중에 3개의 숫자를 입력해주세요.");
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
					System.out.println("3 스트라이크!!!");
					res = true;
				} else {
					System.out.printf("%1d 스트라이크, %1d 볼, %1d 아웃 \n", strike, ball, out);
					count++;
					strike = 0;
					ball = 0;
					out = 0;
				}
				
			} while (res == false);
			
			System.out.println(count + "번 만에 정답입니다.");
			System.out.println("정답 : " + Arrays.toString(arr));

		} else {
			int strike = 0;
			int ball = 0;
			int out = 0;
			int count = 0;
			boolean res = false;
			do {
				System.out.println("0 ~ 9 중에 4개의 숫자를 입력해주세요.");
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
					System.out.println("4 스트라이크!!!");
					res = true;
				} else {
					System.out.printf("%1d 스트라이크, %1d 볼, %1d 아웃 \n", strike, ball, out);
					count++;
					strike = 0;
					ball = 0;
					out = 0;
				}
				
			} while (res == false);
			
			System.out.println(count + "번 만에 정답입니다.");
			System.out.println("정답 : " + Arrays.toString(arr));
			
		}

	}

}

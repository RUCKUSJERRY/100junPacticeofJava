package com.level01;

import java.util.Arrays;

public class mathGiveUp {

	public static void main(String[] args) {

		int[] answer =
				 {1,3,2,4,2};
				// { 1, 2, 3, 4, 5 };
				//{ 1, 2, 3, 4, 5, 4, 3, 2, 1 };

		solution(answer);

	}

	public static int[] solution(int[] answers) {

		int[] math1 = { 1, 2, 3, 4, 5 };
		int num1 = 0;
		int cnt1 = 0;
		int[] math2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int num2 = 0;
		int cnt2 = 0;
		int[] math3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		int num3 = 0;
		int cnt3 = 0;

		for (int i = 0; i < answers.length; i++) {
		// ������ 1�� ��� ������ ���� ���ϰ� ���ؼ� ���������� cnt1++;
			if (math1[num1] == answers[i]) {
				cnt1++;
				System.out.println(math1[num1] + " : " + answers[i]);
			}
			num1++;

			if (num1 == 5) {
				num1 = 0;
			}

		}

		System.out.println("������ 1�� ���� : " + cnt1);

		for (int i = 0; i < answers.length; i++) {
		// ������ 2�� ��� ������ ���� ���ϰ� ���ؼ� ���������� cnt2++;

			if (math2[num2] == answers[i]) {
				cnt2++;
				System.out.println(math2[num2] + " : " + answers[i]);
			}
			num2++;
			if (num2 == 8) {
				num2 = 0;
			}
		}

		System.out.println("������ 2�� ���� : " + cnt2);

		for (int i = 0; i < answers.length; i++) {
		// ������ 3�� ��� ������ ���� ���ϰ� ���ؼ� ���������� cnt3++;

			if (math3[num3] == answers[i]) {
				cnt3++;
				System.out.println(math3[num3] + " : " + answers[i]);
			}
			num3++;
			if (num3 == 10) {
				num3 = 0;
			}
		}

		System.out.println("������ 3�� ���� : " + cnt3);

		int length = 0;
		int[] answer = {};
		// �� �κ��� �밡���ε�...���� ���� ���ڶ��� ����.
		// ������ ���ڵ��� ���� ���� ���� ���� ����� �� ��ŭ �迭�� ���̸� �ʱ�ȭ�ؼ� �ش� ���� �־ �����Ѵ�.
		if (cnt1 > cnt2 && cnt1 > cnt3) {
			length = 1;
			answer = new int[length];
			answer[0] = 1;
		} else if (cnt2 > cnt1 && cnt2 > cnt3) {
			length = 1;
			answer = new int[length];
			answer[0] = 2;	
		} else if (cnt3 > cnt1 && cnt3 > cnt2) {
			length = 1;
			answer = new int[length];
			answer[0] = 3;	
			
		} else if (cnt1 == cnt2 && cnt1 > cnt3) {
			length = 2;
			answer = new int[length];
			answer[0] = 1;
			answer[1] = 2;
			
		} else if (cnt2 == cnt3 && cnt2 > cnt1) {
			length = 2;
			answer = new int[length];
			answer[0] = 2;
			answer[1] = 3;
		} else if (cnt3 == cnt1 && cnt3 > cnt2) {
			length = 2;
			answer = new int[length];
			answer[0] = 1;
			answer[1] = 3;
						
		} else if (cnt1 == cnt2 && cnt1 == cnt3) {
			length = 3;
			answer = new int[length];
			answer[0] = 1;
			answer[1] = 2;
			answer[2] = 3;
		}		

		
		System.out.println(Arrays.toString(answer));

		return answer;
	}

}

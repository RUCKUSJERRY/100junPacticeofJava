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
		// 수포자 1의 답안 패턴을 정답 패턴과 비교해서 맞을때마다 cnt1++;
			if (math1[num1] == answers[i]) {
				cnt1++;
				System.out.println(math1[num1] + " : " + answers[i]);
			}
			num1++;

			if (num1 == 5) {
				num1 = 0;
			}

		}

		System.out.println("수포자 1의 점수 : " + cnt1);

		for (int i = 0; i < answers.length; i++) {
		// 수포자 2의 답안 패턴을 정답 패턴과 비교해서 맞을때마다 cnt2++;

			if (math2[num2] == answers[i]) {
				cnt2++;
				System.out.println(math2[num2] + " : " + answers[i]);
			}
			num2++;
			if (num2 == 8) {
				num2 = 0;
			}
		}

		System.out.println("수포자 2의 점수 : " + cnt2);

		for (int i = 0; i < answers.length; i++) {
		// 수포자 3의 답안 패턴을 정답 패턴과 비교해서 맞을때마다 cnt3++;

			if (math3[num3] == answers[i]) {
				cnt3++;
				System.out.println(math3[num3] + " : " + answers[i]);
			}
			num3++;
			if (num3 == 10) {
				num3 = 0;
			}
		}

		System.out.println("수포자 3의 점수 : " + cnt3);

		int length = 0;
		int[] answer = {};
		// 이 부분이 노가다인데...아직 많이 모자란가 보다.
		// 각각의 숫자들을 비교해 가장 많이 맞은 사람이 수 만큼 배열의 길이를 초기화해서 해당 값을 넣어서 리턴한다.
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

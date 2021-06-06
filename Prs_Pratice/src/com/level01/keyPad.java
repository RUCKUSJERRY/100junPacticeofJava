package com.level01;

public class keyPad {
	
	public static void main(String[] args) {
		int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
		solution(numbers, "left");
	}
	
	public static String solution(int[] numbers, String hand) {
		
		String answer = "";

		// �켱 ���� �հ����� ������ �հ����� ���� �����Ѵ�.
		int left = 10; // == *
		int right = 11; // == #

		for (int i = 0; i < numbers.length; i++) {
			// 1, 4, 7, 3, 6, 9 �϶� �׳� �־������
			switch (numbers[i]) {
			case 1:
			case 4:
			case 7:
				answer += "L";
				left = numbers[i];
				break;
			case 3:
			case 6:
			case 9:
				answer += "R";
				right = numbers[i];
				break;
			case 0:
			case 2:
			case 5:
			case 8:
				// 0,2,5,8�϶��� ������ �Ÿ��� ���ؼ�, ����� ���� �հ����� �����Ѵ�.
				if (getHands(left, right, numbers[i], hand).equals("L")) {
					answer += "L";
					left = numbers[i];
					break;
				} else {
					answer += "R";
					right = numbers[i];
					break;
				}

			}

		}
		return answer;
	}

	public static String getHands(int left, int right, int number, String hand) {

		// �� ���ڸ����� ��ġ�� �迭�� ����ش�.
		int[][] keyPad = { { 3, 1 }, { 0, 0 }, { 0, 1 }, { 0, 2 }, { 1, 0 }, { 1, 1 }, { 1, 2 }, { 2, 0 }, { 2, 1 },
				{ 2, 2 }, { 3, 0 }, { 3, 2 }

		};

		// �־��� ���ڿ� �հ����� ��ġ�� ������ ���� ū�� - ���� ���� ���� ���� �����ش�.
		int leftDistance = getDistance(keyPad[left][0], keyPad[number][0])
				+ getDistance(keyPad[left][1], keyPad[number][1]);
		int rightDistance = getDistance(keyPad[right][0], keyPad[number][0])
				+ getDistance(keyPad[right][1], keyPad[number][1]);

		// �ش� ���� ���Ͽ� ���� ���� �����ϰ�, ���� ���̸� hand�� ���Ͽ� �����Ѵ�.
		if (leftDistance < rightDistance) {
			return "L";
		} else if (leftDistance > rightDistance) {
			return "R";
		} else {
			if (hand.equals("left")) {
				return "L";
			} else {
				return "R";
			}
		}

	}

	public static int getDistance(int a, int b) {
		// ���밪�� ���ϴ� �޼ҵ� (���� �����غô�.)
		if (a < b) {
			return b - a;
		} else if (a > b) {
			return a - b;
		} else {
			return a - b;
		}

	}

}

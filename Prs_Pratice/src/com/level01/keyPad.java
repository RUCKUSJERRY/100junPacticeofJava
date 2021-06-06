package com.level01;

public class keyPad {
	
	public static void main(String[] args) {
		int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
		solution(numbers, "left");
	}
	
	public static String solution(int[] numbers, String hand) {
		
		String answer = "";

		// 우선 왼쪽 손가락과 오른쪽 손가락을 변수 선언한다.
		int left = 10; // == *
		int right = 11; // == #

		for (int i = 0; i < numbers.length; i++) {
			// 1, 4, 7, 3, 6, 9 일때 그냥 넣어버리기
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
				// 0,2,5,8일때는 각각의 거리를 구해서, 가까운 쪽의 손가락을 리턴한다.
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

		// 각 숫자마다의 위치를 배열로 담아준다.
		int[][] keyPad = { { 3, 1 }, { 0, 0 }, { 0, 1 }, { 0, 2 }, { 1, 0 }, { 1, 1 }, { 1, 2 }, { 2, 0 }, { 2, 1 },
				{ 2, 2 }, { 3, 0 }, { 3, 2 }

		};

		// 주어진 숫자와 손가락의 위치의 각각의 값중 큰값 - 작은 값을 해준 값을 더해준다.
		int leftDistance = getDistance(keyPad[left][0], keyPad[number][0])
				+ getDistance(keyPad[left][1], keyPad[number][1]);
		int rightDistance = getDistance(keyPad[right][0], keyPad[number][0])
				+ getDistance(keyPad[right][1], keyPad[number][1]);

		// 해당 값을 비교하여 작은 값을 리턴하고, 같은 값이면 hand를 비교하여 리턴한다.
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
		// 절대값을 구하는 메소드 (직접 구현해봤다.)
		if (a < b) {
			return b - a;
		} else if (a > b) {
			return a - b;
		} else {
			return a - b;
		}

	}

}

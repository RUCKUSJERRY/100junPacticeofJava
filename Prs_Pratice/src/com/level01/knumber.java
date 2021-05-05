package com.level01;

import java.util.Arrays;

public class knumber {

	public static void main(String[] args) {

		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
		
		solution(array, commands);
		
	}

	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = new int [commands.length];
		// 입력할 명령문의 횟수 만큼 정답 배열 길이 선언
			
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.deepToString(commands));
		
		
			for (int i = 0; i < commands.length; i++) {
				
					int [] temp = null;
					temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
					//copyOfRange(복사해올 배열 객체, 복사할 인덱스 시작점, 복사할 인덱스 종료점)
					System.out.println(Arrays.toString(temp));
					Arrays.sort(temp);
					System.out.println(Arrays.toString(temp));
					
					answer[i] = temp[commands[i][2]-1];
					// 명령문의 2번지에 있는 숫자만큼의 인덱스 값을 배열의 인덱스 값으로 넣어서 정답 배열에 넣어주기
					System.out.println(temp[commands[i][2]-1]);
				
			}
		System.out.println(Arrays.toString(answer));
		return answer;
	}

}

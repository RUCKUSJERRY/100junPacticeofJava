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
		// �Է��� ��ɹ��� Ƚ�� ��ŭ ���� �迭 ���� ����
			
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.deepToString(commands));
		
		
			for (int i = 0; i < commands.length; i++) {
				
					int [] temp = null;
					temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
					//copyOfRange(�����ؿ� �迭 ��ü, ������ �ε��� ������, ������ �ε��� ������)
					System.out.println(Arrays.toString(temp));
					Arrays.sort(temp);
					System.out.println(Arrays.toString(temp));
					
					answer[i] = temp[commands[i][2]-1];
					// ��ɹ��� 2������ �ִ� ���ڸ�ŭ�� �ε��� ���� �迭�� �ε��� ������ �־ ���� �迭�� �־��ֱ�
					System.out.println(temp[commands[i][2]-1]);
				
			}
		System.out.println(Arrays.toString(answer));
		return answer;
	}

}

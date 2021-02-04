package com.level01;

import java.util.Arrays;
import java.util.Iterator;

public class crain {

	/*
	 * [0, 0, 0, 0, 0, 1], [0, 0, 1, 0, 3, 5], [0, 2, 5, 0, 1, 4], [4, 2, 4, 4, 2,
	 * 4], [3, 5, 1, 3, 1, 6], [1, 2, 3, 4, 5, 6],
	 * 
	 * [0, 0, 0, 0, 0, 1], [0, 0, 0, 0, 0, 5], [0, 0, 5, 0, 0, 4], [0, 2, 4, 0, 2,
	 * 4], [0, 5, 1, 3, 1, 6], [0, 2, 3, 4, 5, 6],
	 * 
	 * [1, 5, 3, 5, 1, 2, 1, 4, 6, 6, 6, 5]
	 * 
	 * [4, 3, 1, 1, 3, 2, 1, 4, 1, 5, 4, 2] [4, 2, 1, 4, 1, 5, 4, 2, 0, 0, 0, 0]
	 * 
	 */

	public static void main(String[] args) {

		int[][] board = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },
				{ 3, 5, 1, 3, 1 } };
		int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };
		solution(board, moves);

	}

	/*
	 * 0 1 2 3 4 [0,0,0,0,0] 0 [0,0,1,0,3] 1 [0,2,5,0,1] 2 [4,2,4,4,2] 3 [3,5,1,3,1]
	 * 4
	 */

	// {1,5,3,5,1,2,1,4};
	// 4 3 1 1 3 2 0 4
	/*
	 * 3 5 4 2 3
	 * 
	 */

	public static int solution(int[][] board, int[] moves) {
		int answer = 0;
		int[] res = new int[moves.length]; // �ٱ���

		int cnt = 0;

		// moves�� n������ ��ȣ�� �����´�.
		for (int i = 0; i < moves.length; i++) {

			// 2�� n������ 1���� �迭 ������
			for (int j = 0; j < board.length; j++) {

				// ũ���ο��� ���� ��������
				if (board[j][moves[i] - 1] != 0) {
					res[cnt] = board[j][moves[i] - 1];
					if (cnt >= 1 && res[cnt] == res[cnt - 1]) {
						res[cnt] = 0;
						res[cnt - 1] = 0;
						cnt -= 2;
						answer += 2;

					}
					cnt++;
					board[j][moves[i] - 1] = 0;
					break;
				}
				

			}

		}

		System.out.println(Arrays.toString(res));

		System.out.println(Arrays.toString(res));
		System.out.println(Arrays.toString(board[0]));
		System.out.println(Arrays.toString(board[1]));
		System.out.println(Arrays.toString(board[2]));
		System.out.println(Arrays.toString(board[3]));
		System.out.println(Arrays.toString(board[4]));

		// �׸��� �ش� ���� res�迭�� 0���� �迭�� �����´�.
		// �׸��� 1���� ���ʹ� 0���� �迭�̶� ������ ���� �Ŀ�,
		// ������ ���� ��������, Ʋ���� ���� �־��ش�.

		// �� ���� board�� n������ ���ڵ��� ��ĭ�� ������ �����ش�.

		// �ݺ�
		System.out.println(answer);
		return answer;
	}

}
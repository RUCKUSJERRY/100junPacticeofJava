package com.level01;

public class crain {

	public static void main(String[] args) {

		int[][] board = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },
				{ 3, 5, 1, 3, 1 } };
		int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };
		solution(board, moves);

	}

	public static int solution(int[][] board, int[] moves) {
		int answer = 0;
		int[] res = new int[moves.length];
		// �ٱ���(res) �迭�� ũ�⸦ ���Ƚ��(moves)�� �����ϰ� �����Ѵ�.
		int cnt = 0;

		for (int i = 0; i < moves.length; i++) {
		// ���Ƚ�� ��ŭ �ݺ����� ������ �� �̴�.

			for (int j = 0; j < board.length; j++) {
			// �� ���� ���� ȭ���� ���� �� ��ŭ �ݺ��Ѵ�
				
				if (board[j][moves[i] - 1] != 0) {
				// ���࿡ ����ȭ���� [j] ��° ���� [ũ������ ���� ��ġ(moves[i]-1)] �� 0�� �ƴϸ�
	            // 0�� �ƴ϶�� ���� �ش� ��ġ�� ���ڰ� �����Ѵٴ� �ǹ�,
	            // ���ڰ� �����Ѵٴ� �� 1~5 ������ �����Ѵٴ� ������ �� ������ �ٱ��Ͽ� ����ش�.
					
					res[cnt] = board[j][moves[i] - 1];
					// �ش� ��ġ�� ���� �ٱ����� [cnt] ��° ������ �ʱ�ȭ �Ǿ���.
					
					if (cnt >= 1 && res[cnt] == res[cnt - 1]) {
					// ���࿡ �ٱ��Ͽ� 2���̻� ��������鼭 (cnt >= 1)
	                // ��� ���� ������ �� ���� ���� ������ ���� �����̶�� res[cnt] == res[cnt - 1]
						
						res[cnt] = 0;
						res[cnt - 1] = 0;
						cnt -= 2;
						answer += 2;
						// �ش� ���� 2���� �����ְ� ����� ���������� return�� �����ش�.
						
					}
					
					cnt++;
					// ������ ä�������� ���� ĭ�� ��ĭ �÷��ش�
					board[j][moves[i] - 1] = 0;
					// ������ ������ ���� �ִ� ���� ȭ�鿡 ������ �����Ѵ�.
					break;
					// ���������� �ݺ����� �� �����ʿ�����Ƿ� ���߰� ���Ƚ���� �Ѿ��.
				}
				
			}

		}

		return answer;
		// ������
	}

}
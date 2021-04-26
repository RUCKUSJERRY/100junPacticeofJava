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
		// 바구니(res) 배열의 크기를 사용횟수(moves)와 동일하게 설정한다.
		int cnt = 0;

		for (int i = 0; i < moves.length; i++) {
		// 사용횟수 만큼 반복문을 실행할 것 이다.

			for (int j = 0; j < board.length; j++) {
			// 그 다음 게임 화면의 행의 수 만큼 반복한다
				
				if (board[j][moves[i] - 1] != 0) {
				// 만약에 게임화면의 [j] 번째 행의 [크레인이 집은 위치(moves[i]-1)] 가 0이 아니면
	            // 0이 아니라는 것은 해당 위치에 숫자가 존재한다는 의미,
	            // 숫자가 존재한다는 건 1~5 인형이 존재한다는 뜻으로 그 인형을 바구니에 담아준다.
					
					res[cnt] = board[j][moves[i] - 1];
					// 해당 위치에 값이 바구니의 [cnt] 번째 값으로 초기화 되었다.
					
					if (cnt >= 1 && res[cnt] == res[cnt - 1]) {
					// 만약에 바구니에 2개이상 담겨있으면서 (cnt >= 1)
	                // 방금 담은 인형과 그 전에 담은 인형이 같은 인형이라면 res[cnt] == res[cnt - 1]
						
						res[cnt] = 0;
						res[cnt - 1] = 0;
						cnt -= 2;
						answer += 2;
						// 해당 인형 2개를 없애주고 사라진 인형개수를 return에 더해준다.
						
					}
					
					cnt++;
					// 인형이 채워졌으니 넣을 칸을 한칸 올려준다
					board[j][moves[i] - 1] = 0;
					// 가져온 인형이 원래 있던 게임 화면에 인형을 제거한다.
					break;
					// 가져왔으니 반복문을 더 돌릴필요없으므로 멈추고 사용횟수로 넘어간다.
				}
				
			}

		}

		return answer;
		// 결과출력
	}

}
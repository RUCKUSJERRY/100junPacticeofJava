package com.level01;

public class crain {


	
	public static void main(String[] args) {
		
		int [][] board = 
				{{0,0,0,0,0},
				{0,0,1,0,3},
				{0,2,5,0,1},
				{4,2,4,4,2},
				{3,5,1,3,1}};
		int [] moves = {1,5,3,5,1,2,1,4};
		
		System.out.println(moves.length);
		
	}
	
	/*	0 1 2 3 4
	 * [0,0,0,0,0] 0
	 * [0,0,1,0,3] 1
	 * [0,2,5,0,1] 2
	 * [4,2,4,4,2] 3
	 * [3,5,1,3,1] 4
	 */
	
	public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        int [] res = new int [moves.length];
        
        int n = 0; // moves의 n번지의 값
        
        // moves의 n번지의 번호를 가져온다.
        for (int i = 0; i < moves.length; i++) {
			n = moves[i]-1;
			
			// 2차 n번지의 1차원 배열 값들을 
			for (int j = 0; j < board.length; j++) {
				
				
				
			}
			
		}
        // moves의 n번지의 값을 board의 가로의 인덱스 값으로 가져온다.
        
        //숫자를 가져오는 함수
        
        
        
        // 그리고 해당 값을 res배열의 0번지 배열로 가져온다.
        // 그리고 1번지 부터는 0번지 배열이랑 같은지 비교한 후에,
        // 같으면 값을 넣지말고, 틀리면 값을 넣어준다.
        
        return answer;
    }

}
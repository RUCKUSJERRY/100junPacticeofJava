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
        
        int n = 0; // moves�� n������ ��
        
        // moves�� n������ ��ȣ�� �����´�.
        for (int i = 0; i < moves.length; i++) {
			n = moves[i]-1;
			
			// 2�� n������ 1���� �迭 ������ 
			for (int j = 0; j < board.length; j++) {
				
				
				
			}
			
		}
        // moves�� n������ ���� board�� ������ �ε��� ������ �����´�.
        
        //���ڸ� �������� �Լ�
        
        
        
        // �׸��� �ش� ���� res�迭�� 0���� �迭�� �����´�.
        // �׸��� 1���� ���ʹ� 0���� �迭�̶� ������ ���� �Ŀ�,
        // ������ ���� ��������, Ʋ���� ���� �־��ش�.
        
        return answer;
    }

}
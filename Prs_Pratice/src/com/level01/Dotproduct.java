package com.level01;

public class Dotproduct {

	public static void main(String[] args) {

		int [] a = {1,2,3,4};
		int [] b = {-3,-1,0,2};
		
		solution(a, b);
	}
	
    public static int solution(int[] a, int[] b) {
        int answer = 0;
        
        // 내적 공식 a1 * b1 + a2 * b2 + ...
        for (int i = 0; i < b.length; i++) {
			answer += a[i] * b[i];
		}

        return answer;
    }

}

package com.level01;

public class xnNumber {

	public static void main(String[] args) {
		
	}
	
	public long[] solution(int x, int n) {
        long[] answer = new long[n];
        int a = x;
        for (int i = 0; i < n; i++) {
                a = x * (i+1);
            answer[i] = a;
        }
        
        return answer;
    }

}

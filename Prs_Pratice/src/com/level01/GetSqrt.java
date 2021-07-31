package com.level01;

public class GetSqrt {

	public static void main(String[] args) {
		GetSqrt res = new GetSqrt();
		res.solution(121);

	}

	public long solution(long n) {
        long answer = -1;
        
        long temp = (long) Math.sqrt(n);
        
        if (Math.pow(temp, 2) == n) {
            answer = (long) Math.pow(temp + 1, 2);
        }
        
        return answer;
    }
	
}

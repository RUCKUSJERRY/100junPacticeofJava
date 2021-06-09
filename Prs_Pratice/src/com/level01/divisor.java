package com.level01;

public class divisor {

	public static void main(String[] args) {
		
		solution(24, 27);
		
	}
	
    public static int solution(int left, int right) {
        int answer = 0;
        
        // left ~ right 까지
        for (int i = left; i <= right; i++) {
			
        	// 만약 i가 약수라면 더하고 아니면 뺀다
        	if (getDivisor(i)) {
        		answer += i;
        	} else {
        		answer -= i;
        	}
        	
		}
        return answer;
    }
    
    private static boolean getDivisor(int n) {
    	
    	int count = 0;
    	
    	// 1~n 까지 n을 나눠서 떨어지면 count를 더해준다.
    	for (int i = 1; i <= n; i++) {			
    		if (n % i == 0) {
    			count++;
    		}   		
		}
    	
    	// 카운트가 짝수면 true, 홀수면 false
    	if (count % 2 == 0) {
    		return true;
    	} else {
    		return false;
    	}
    	
    	
    }
	
}

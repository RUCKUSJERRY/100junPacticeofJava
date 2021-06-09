package com.level01;

public class divisor {

	public static void main(String[] args) {
		
		solution(24, 27);
		
	}
	
    public static int solution(int left, int right) {
        int answer = 0;
        
        // left ~ right ����
        for (int i = left; i <= right; i++) {
			
        	// ���� i�� ������ ���ϰ� �ƴϸ� ����
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
    	
    	// 1~n ���� n�� ������ �������� count�� �����ش�.
    	for (int i = 1; i <= n; i++) {			
    		if (n % i == 0) {
    			count++;
    		}   		
		}
    	
    	// ī��Ʈ�� ¦���� true, Ȧ���� false
    	if (count % 2 == 0) {
    		return true;
    	} else {
    		return false;
    	}
    	
    	
    }
	
}

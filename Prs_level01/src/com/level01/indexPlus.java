package com.level01;

public class indexPlus {

	public static void main(String[] args) {
		solution(123123123);
	}
	
    public static int solution(int n) {
        int answer = 0;
        String a = Integer.toString(n);
        
        for (int i = 0; i < a.length(); i++) {
			answer += Character.getNumericValue(a.charAt(i));
		}
        	
        System.out.println(answer);
        return answer;
    }
	
}



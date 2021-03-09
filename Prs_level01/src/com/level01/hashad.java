package com.level01;

public class hashad {

	public static void main(String[] args) {
		int x = 0;
		solution(x);
	}
	
    public static boolean solution(int x) {
        boolean answer = true;
        
        int sum = 0;
        
        String a = Integer.toString(x);
        
        for (int i = 0; i < a.length(); i++) {
			sum += Character.getNumericValue(a.charAt(i));
		}
        
        if (x % sum == 0) {
        	answer = true;
        } else {
        	answer = false;
        }
        
        return answer;
    }

}

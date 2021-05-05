package com.level01;

public class stringBasic {

	public static void main(String[] args) {
		String s = "1234";
		
		solution(s);
	}
	
	// try catch 로 하신 분이 계신다...
	
	public static boolean solution(String s) {
        boolean answer = true;
        char [] temp = s.toCharArray();
        if (s.length() == 4 || s.length() == 6) {
            for (int i = 0; i < temp.length; i++) {
            	if (Character.isLetter(temp[i])) {
            		answer = false;
            	}
			}
        } else {
            answer = false;
        }
        
            
        System.out.println(answer);
        return answer;
    }
	
}

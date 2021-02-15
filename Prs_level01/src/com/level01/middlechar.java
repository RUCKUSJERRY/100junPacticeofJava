package com.level01;

public class middlechar {

	public static void main(String[] args) {
		
		String s = "aaaaabbbbb";
			
		solution(s);
	}
	
    public static String solution(String s) {
        String answer = "";
        
        if (s.length() % 2 == 0) {
        	answer += s.charAt(s.length() / 2 - 1);
        	answer += s.charAt(s.length() / 2);     	
        } else {
        	answer += s.charAt(s.length() / 2);
        }
        
        System.out.println(answer);
        
        return answer;
    }
	
}

package com.level01;

public class caesarNum {

	public static void main(String[] args) {
		
		caesarNum c = new caesarNum();
		
		
		
		String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		int n = 4;
		
		c.solution(s, n);
	}
	
		// 대문자 65 ~ 90
	 	// 소문자 97 ~ 122
	
	 public String solution(String s, int n) {
	        String answer = "";
	       
	        for (int i = 0; i < s.length(); i++) {
	        	char temp = 0;
	        	if (s.charAt(i) > 64 && s.charAt(i) < 91) {
	        		
	        		temp += s.charAt(i);
	        		temp += n;
	        		
	        		if (temp > 90) {
	        			int a = temp - 90;
	        			temp = 0;
	        			temp += 64;
	        			temp += a;
	        		}
	        		
	        		answer += temp;
	        		
	        	} else if (s.charAt(i) > 96 && s.charAt(i) < 123) {
	        		
	        		temp += s.charAt(i);
	        		temp += n;
	        		
	        		if (temp > 122) {
	        			int a = temp - 122;
	        			temp = 0;
	        			temp += 96;
	        			temp += a;
	        		}
	        		
	        		answer += temp;
	        	} else if (s.charAt(i) == ' ') {
	        		answer += ' ';
	        	}
	        	
			}
	        System.out.println(answer);
	        return answer;
	    }
	
}

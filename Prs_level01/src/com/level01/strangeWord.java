package com.level01;

import java.util.Iterator;
import java.util.StringTokenizer;

public class strangeWord {

	public static void main(String[] args) {
		
		String s = "try hello world aaaa a a a a a a";
		solution(s);
	}
	
    public static String solution(String s) {
        String answer = "";
        	int count = 0;
        	for (int i = 0; i < s.length(); i++) {
				
        		char ch = s.charAt(i);
        		
        		if (s.charAt(i) == ' ') {
        			answer += ' ';
        			count = 0;
        		} else {
        			if (count % 2 == 0) {
            			answer += Character.toUpperCase(ch);
            			count++;
            		} else if (count % 2 == 1) {
            			answer += Character.toLowerCase(ch);
            			count++;
            		} 	
        		}
        		
        		
        		
        		
			}
        	
        System.out.println(answer);
        return answer;
    }
	
}

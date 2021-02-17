package com.level01;

import java.util.Arrays;

public class sortAsc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Zbcdefg";
		solution(s);
		
	}

	public static String solution(String s) {
        String answer = "";
        char [] temp = new char [s.length()];
        
        for (int i = 0; i < temp.length; i++) {
        	temp[i] = s.charAt(i);
		}
        
        Arrays.sort(temp);
        
        for (int i = temp.length-1; i >= 0; i--) {
			answer += temp[i];

		}
        
        return answer;
    }
	
}

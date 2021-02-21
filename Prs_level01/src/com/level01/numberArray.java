package com.level01;

import java.util.Arrays;
import java.util.Iterator;

public class numberArray {

	public static void main(String[] args) {
		
		long n = 1234567891;
		solution(n);
	}
	
    public static int[] solution(long n) {
        
    	String a = Long.toString(n);
    	System.out.println(a);
    	int[] answer = new int [a.length()];
    	int index = a.length()-1;
        	for (int i = 0; i < answer.length; i++) {
				char ch = a.charAt(index);
        		answer[i] = Character.getNumericValue(ch);
        		
        		index--;
        		
			}
        System.out.println(Arrays.toString(answer));
        return answer;
    }
	
}

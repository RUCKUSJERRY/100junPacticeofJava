package com.test01;

import java.util.Scanner;

public class level1_1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		
		System.out.println(solution(n));
		
	}
	
	
	public static int[] solution(long n) {
        
		String a = Long.toString(n);
		String re = "";
          
        int[] answer = new int[a.length()];
        
        for (int i = a.length()-1; i >= 0 ; i--) {
        	re += a.charAt(i);
		}
        
        System.out.println(re);
        
        for (int i = 0; i < re.length(); i++) {
			answer[i] = Character.getNumericValue(re.charAt(i));
			System.out.println(answer[i]);
		}
        
        return answer;
    }
	
}

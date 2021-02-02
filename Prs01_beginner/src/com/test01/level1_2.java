package com.test01;

import java.util.Scanner;

public class level1_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(solution(n));
	}
	
	public static int solution(int n) {
        int answer = 0;
        
        String three = "";
        String rev = "";
        // 3진법 변환
        while (n > 0) {
        	three = (n % 3) + three;
        	n/=3;
        }
        
        System.out.println(three);
        
        
        // 앞뒤 반전 
//        for (int i = three.length()-1; i >= 0 ; i--) {
//			rev += three.charAt(i);
//		}
//        
//        System.out.println(rev);
        
        // 10진법으로 계산하기
        
        for (int i = 0; i < three.length(); i++) {
			
        	answer += Character.getNumericValue(three.charAt(i)) * Math.pow(3, i);
        	
		}
        
        return answer;
    }

}

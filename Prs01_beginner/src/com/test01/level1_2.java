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
        // 3���� ��ȯ
        while (n > 0) {
        	three = (n % 3) + three;
        	n/=3;
        }
        
        System.out.println(three);
        
        
        // �յ� ���� 
//        for (int i = three.length()-1; i >= 0 ; i--) {
//			rev += three.charAt(i);
//		}
//        
//        System.out.println(rev);
        
        // 10�������� ����ϱ�
        
        for (int i = 0; i < three.length(); i++) {
			
        	answer += Character.getNumericValue(three.charAt(i)) * Math.pow(3, i);
        	
		}
        
        return answer;
    }

}

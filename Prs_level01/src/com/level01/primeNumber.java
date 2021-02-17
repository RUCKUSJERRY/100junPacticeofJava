package com.level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class primeNumber {

	public static void main(String[] args) {
		int n = 100;
		
		solution(n);
		
	}
	
	public static int solution(int n) {
        int answer = 0;
        	
        int [] check = new int[n+1];
        int num = 1;
        for (int i = 2; i <= n; i++) {
			check[i] = i;
			// {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
			
		}
        
        System.out.println(Arrays.toString(check));
        
        for (int i = 2; i <= n; i++) {
			if (check[i] == 0) {
				continue;
			}
			
			for (int j = i + i; j < check.length; j+=i) {
				check[j] = 0;
				
			}
			
		}
        
        for (int i = 2; i < check.length; i++) {
			if (check[i] != 0) {
				answer++;
			}
		}
        
        	// 1�� ������ �������鼭
        	// �ڱ� �ڽ����� ������ �������鼭
        	// �ٸ� ���δ� �ȳ����� �������°�
        	
//        	for (int i = 2; i <= n; i++) {
//        		if (primeCheck(i)) {
//        			answer++;
//        		}
//				
//			}
        System.out.println(answer);
        return answer;
    }
	
	public static boolean primeCheck(int n) {
		boolean prime = true;
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					prime = false;
					break;
				}
			}
		
		return prime;
	}

}

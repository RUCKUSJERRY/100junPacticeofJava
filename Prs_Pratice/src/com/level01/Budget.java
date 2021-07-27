package com.level01;

import java.util.Arrays;

public class Budget {

	public static void main(String[] args) {
		Budget bud = new Budget();
		bud.solution(new int [] {1,3,2,5,4}, 9);

	}

	public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);
        
        for (int i = 0; i < d.length; i++) {
            
            if (budget < d[i] || budget == 0) {
                break;
            } else {
                budget = budget - d[i];
                answer++;
            }
            
        }
        
        return answer;
    }
	
}

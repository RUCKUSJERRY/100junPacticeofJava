package com.level01;

import java.util.HashSet;
import java.util.Set;

public class gymClothes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		
		int [] reserve = {1, 3, 5};
		
		int [] lost = {2, 4};
		
		solution(n, lost, reserve);
		
		
		
		
	}

	public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        Set<Integer> set = new HashSet<Integer>();
        
        answer = n - lost.length;
        // 우선 잃어버린 학생을 빼준다.
        
        for (int i = 0; i < reserve.length; i++) {
		// 여분있는 학생의 수만큼 반복하자.
        	
        	for (int j = 0; j < lost.length; j++) {
				// reserve[i] 를 모든 reserve[j]와 비교
        		if (reserve[i] - 1 == lost[j] || reserve[i] + 1 == lost[j]) {
        			set.add(reserve[i]);
        			if (reserve[i] - 1 == lost[j]) {
        				
        			} else if (reserve[i] + 1 == lost[j]) {
        				
        			}
        		}
        		
			}
        	
        	
		}
        System.out.println(answer);
        System.out.println(set.size());
        
        return answer;
    }
	
}

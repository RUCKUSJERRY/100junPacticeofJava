package com.level01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class gymClothes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 20;
		
		int [] reserve = {1,3,5,7,9,11,13,15,17,19};
		
		int [] lost = {2,4,7,8,10,11,14,16,17,20};
		
		solution(n, lost, reserve);

	}

	public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        int save = 0;
        // 여유분으로 되찾은 인원수

        for (int i = 0; i < reserve.length; i++) {
		// 여분있는 학생의 수만큼 반복하자.
        	
        	for (int j = 0; j < lost.length; j++) {
        		if(reserve[i] == lost[j]) {
        		// 만약에 읽어버린 학생의 번호와 여유분 학생의 번호가 같다면
        			reserve[i] = -100;
        			lost[j] = -100;
        			save++;
        			
        		} 
			}
        	
        }
        
        System.out.println("잃어버린 학생배열 : " + Arrays.toString(lost));
        System.out.println("여유분 학생 배열 : " + Arrays.toString(reserve));
        
        for (int i = 0; i < reserve.length; i++) {
        // 여유분 학생들은 빼주었으니 이제 체육복을 빌려줘보자
        	for (int j = 0; j < lost.length; j++) {
				if (reserve[i] == -100) {
				// 값이 -100이면 이미 나눠준거니까비교 할거 없이 건너 뛰자
					
				} else if (reserve[i] == lost[j] - 1 || reserve[i] == lost[j] + 1) {
					reserve[i] = -100;
        			lost[j] = -100;
        			save++;
				}
				
				
			}
        	
		}
        
        answer = n - lost.length + save;

        System.out.println("잃어버린 학생배열 : " + Arrays.toString(lost));
        System.out.println("여유분 학생 배열 : " + Arrays.toString(reserve));
        System.out.println("체육복 입은 학생 수 : " + answer);
        return answer;
    }
	
}

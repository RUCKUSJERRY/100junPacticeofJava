package com.level01;

import java.util.Arrays;

public class divisorarray {

	public static void main(String[] args) {
		
		int []arr = {5, 9, 7, 10};
		int divisor = 5;
		
		solution(arr, divisor);

	}
	
    public static int[] solution(int[] arr, int divisor) {
    	
    	int count = 0;
    	for (int i = 0; i < arr.length; i++) {
			
    		if (arr[i] % divisor == 0) {
    			count++;
    		}
    		
		}
    	
    	int[] answer = new int[count];
    	count = 0;
    	for (int i = 0; i < arr.length; i++) {
			
    		if (arr[i] % divisor == 0) {
    			answer[count] = arr[i];
    			count++;
    		}
    		
		}
    	
    	if (count == 0) {
    		answer = new int[1];
    		answer[0] = -1;
    	}
    	
    	Arrays.sort(answer);
    	
        return answer;
    }

}

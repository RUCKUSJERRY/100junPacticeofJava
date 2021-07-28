package com.level01;

import java.util.Arrays;

public class DelMinNum {

	public static void main(String[] args) {
		DelMinNum s = new DelMinNum();
		s.solution(new int [] {1, 2, 3, 4});

	}

	public int[] solution(int[] arr) {
        int[] answer = new int [arr.length - 1];
        
        if (arr.length <= 1) {
            answer = new int [1];
            answer[0] = -1;
        } else {
            int min = Arrays.stream(arr).min().getAsInt();
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (min == arr[i]) {
                    continue;
                } else {
                    answer[count] = arr[i];
                    count++;
                }
            }
            
            
        }
        
        return answer;
    }
	
}

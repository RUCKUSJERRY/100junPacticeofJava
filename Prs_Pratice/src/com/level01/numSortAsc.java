package com.level01;

import java.util.Arrays;

public class numSortAsc {

	public static void main(String[] args) {
		
		numSortAsc num = new numSortAsc();
		
		long n = 118372;
		
		num.solution(n);

	}

	public long solution(long n) {
        long answer = 0;
        
        String temp = "";
        temp = Long.toString(n);
        System.out.println(temp);
        char [] arr = new char [temp.length()];
        
        for (int i = 0; i < arr.length; i++) {
			arr[i] = temp.charAt(i);
		}
        temp = "";
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        
        for (int i = arr.length-1; i >= 0; i--) {
			temp += arr[i];
		}

        answer = Long.parseLong(temp);
        
        System.out.println(answer);
        return answer;
    }
	
}

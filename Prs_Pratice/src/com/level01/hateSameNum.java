package com.level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class hateSameNum {

	public static void main(String[] args) {
		
		int[] arr = {4,4,4,3,3};
			//{1, 1, 3, 3, 0, 1, 1};
		solution(arr);

	}
	
	public static int[] solution(int []arr) {
        
        List<Integer> list = new ArrayList<Integer>();
        
        for (int i = 0; i < arr.length; i++) {
			if (i >= 1 && arr[i] == arr[i - 1]) {
				continue;
			} else {
				list.add(arr[i]);
			}
		}
        System.out.println(list);
        int[] answer = new int [list.size()];
        
        for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
			
        }
        System.out.println(Arrays.toString(answer));
        
        return answer;
    }

}

package com.level01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class twoPickPlus {

	public static void main(String[] args) {
		
		int[] numbers = {2,1,3,4,1,5,6,67,7,2,2,43,6,7,1};
		
		solution(numbers);
		
	}
	
    public static int[] solution(int[] numbers) {
    	
    	System.out.println(Arrays.toString(numbers));
    	Set<Integer> set = new HashSet<Integer>();
    	
    	for (int i = 0; i < numbers.length; i++) {
			for (int j = numbers.length-1; j > i; j--) {
				set.add(numbers[i] + numbers[j]);
			}
    	}
    	
    	int [] answer = new int[set.size()];
    	
    	Iterator<Integer> it = set.iterator();
    	
    	for (int i = 0; i < set.size(); i++) {
				if (it.hasNext()) {
					answer[i] = it.next();
			}	
		}

    	Arrays.sort(answer);
        System.out.println(Arrays.toString(answer));

        return answer;
    }
}

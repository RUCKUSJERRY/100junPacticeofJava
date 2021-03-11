package com.level01;

public class getAverage {

	public static void main(String[] args) {
		getAverage avg = new getAverage();
		
		int[] arr = {2, 3, 4, 5, 6};
		
		avg.solution(arr);

	}
	
	public double solution(int[] arr) {
        double answer = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
        
        
        answer = sum / arr.length;
        System.out.println(answer);
        return answer;
    }

}

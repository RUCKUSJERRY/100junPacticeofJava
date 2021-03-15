package com.level01;

public class collatz {

	public static void main(String[] args) {

		collatz cz = new collatz();
		
		cz.solution(626331);
		
	}
	
	public int solution(int num) {
        int answer = 0;
        int temp = num;
        int count = 0;
        
        while(temp > 1) {
        	
        	if (temp % 2 == 0) {
        		temp = temp / 2;
        		count++;
        		
        	} else if (temp % 2 == 1) {
        		temp = (temp * 3) + 1;
        		count++;
        	}
        	
        	if (count == 500) {
        		count = -1;
        		break;
        	} 
        	
        }
        
        answer = count;
        System.out.println(answer);
        return answer;
    }

}

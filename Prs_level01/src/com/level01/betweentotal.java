package com.level01;

public class betweentotal {

	public static void main(String[] args) {
		betweentotal bet = new betweentotal();
		
		int a = 5;
		int b = 3;
		
		bet.solution(a, b);
		
	}
	
	public long solution(int a, int b) {
        long answer = 0;
        if (a < b) {
        	for (int i = a; i <= b; i++) {
    			answer += i;
    		}
        	
        } else if (a > b) {
        	for (int i = b; i <= a; i++) {
    			answer += i;
    		}
        } else {
        	answer = a;
        }
        
        // (a1+an)/2 * n �������� �������� ���� Ǭ��... math.min math.max �� �ּ� �ִ밪 ���� ��������...
        System.out.println(answer);
        return answer;
    }
	
}

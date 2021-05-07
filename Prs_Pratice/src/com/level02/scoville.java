package com.level02;

import java.util.PriorityQueue;

public class scoville {

	public static void main(String[] args) {
		
		int [] scoville = {0, 0, 0, 0};
//		1, 2, 3, 9, 10, 12
//		10, 10, 10, 10, 10
//		1, 2, 3, 9, 10, 12
//		0, 2, 3, 9, 10, 12
//		0, 0, 3, 9, 10, 12
//		0, 0, 0, 0
//		0, 0, 3, 9, 10, 12
//		0, 0, 3, 9, 10, 12
//		0, 0, 3, 9, 10, 12
//		0, 0
//		0, 0
//		1, 0
		
		int k = 7;
//		7
//		100
//		7
//		7
//		7
//		7
//		7000
//		0
//		1
//		0
//		1
//		1

//		answer
//		2
//		4
//		2
//		2
//		3
//		-1
//		-1
//		0
//		2
//		0
//		-1
//		1	
		solution(scoville, k);
	}
	
	public static int solution(int[] scoville, int k) {
        int answer = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int i = 0; i < scoville.length; i++) {
			pq.add(scoville[i]);
		}
        
        while(pq.size() > 1) {
        // 큐의 사이즈가 1보다 클때까지 반복한다.
        System.out.println(pq);
        	if (pq.peek() < k) {
        	// 현재 가장 작은 큐의 숫자가 기준 스코빌 지수보다 작다면 2개를 뽑아서 스코빌계산식으로 더해준 다음, 다시 큐에 넣어준다.
        		int temp1 = pq.poll();
            	int temp2 = pq.poll();
            	System.out.println(temp1 + " : " + temp2);
            	System.out.println(getScoville(temp1, temp2));
            	pq.add(getScoville(temp1, temp2));
            	answer++;
        	} else {
        		break;
        	}
	
        }
        
        System.out.println(pq);
        
        if (pq.peek() <= k) {
        	answer = -1;
        }
        
        System.out.println(answer);
        return answer;
    }
	
	private static int getScoville(int a, int b) {
		return a + (b * 2);	
	}
	
}

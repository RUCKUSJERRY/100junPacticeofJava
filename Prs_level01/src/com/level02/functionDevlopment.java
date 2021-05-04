package com.level02;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class functionDevlopment {

	public static void main(String[] args) {
			
		int[] progresses = {99,99,99,99,99,99};
		int[] speeds = {1,1,1,1,1,1};
			
		solution(progresses, speeds);
	}
	
	public static int[] solution(int[] progresses, int[] speeds) {
       
		Stack<Integer> stack = new Stack<Integer>();
        // 개발 시간을 담는 스택 
		
        List<Integer> list = new ArrayList<Integer>();
        // 배포 기능 개수를 담는 리스트 나중에 answer 배열로 담아서 리턴할 예정
        
        	int day = 0;
        	// 개발 완료 일자
        
        	for (int i = progresses.length-1; i >= 0; i--) {
			// 작업의 배열 길이 만큼 반복문을 돌린다.
				int tempProgresses = progresses[i];
				// i번지의 작업을 잠시 담아두는 곳
				
				while (tempProgresses < 100) {
				// 해당 작업율이 100보다 작을 때 작업속도를 더하면서 반복하고, 개발완료일자를 ++해준다
					tempProgresses += speeds[i];
					day++;
				}
				stack.add(day);
				// 개발 완료 일자를 스택에 더해준다.
				day = 0;
				// 다음 개발 일자를 계산하기위해 0으로 초기화.
			}

        	int count = 1;
        	// 한번에 배포 가능한 단위

        	int temp = stack.pop();
        	// 맨위의 스택을 가져온다.
        	
        	while(!stack.isEmpty()) {
        	// 스택이 비어있을때까지 반복한다.
        		
        			if (temp >= stack.peek()) {
        			// 가져온 스택이랑 그다음 가장 맨 위의 있는 스택이랑 비교해서
        			// 가져온 스택이 더 크거나 같으면
            			stack.pop();
            			// 없애주고
            			count++;
            			// 카운트에 더해준다.
            			if (stack.size() == 0) {
            			// 만약에 스택이 비어있으면 멈춘다
            				list.add(count);
            				break;
            			}
            		} else {
            			
            			list.add(count);
            			// 여기는 가져온 스택이 작은경우만 있으니 이때는 그냥 바로 list에 더해주고
            			count = 1;
            			// 개발개수 카운트를 1로 초기화한다.
            			
            			if (stack.size() == 0) {
            				list.add(count);
            				break;
            			} else {
            			// 그리고 현재 가장 꼭 대기에 있는 개발일자를 temp에 다시 저장해주고, pop으로 날려준다.
            				temp = stack.peek();
            				stack.pop();
            			}
            		}
        	}

        	// answer 변수에 리스트로 가져온 기능배포개수를 담아준 후에 리턴!
        	 int[] answer = new int[list.size()];
        	 
        	 for (int i = 0; i < list.size(); i++) {
				answer[i] = list.get(i);

			}
        	
        	 
        	return answer;
    }

}

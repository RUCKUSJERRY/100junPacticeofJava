package com.level02;

import java.util.Stack;

public class SpyClothes {

	public static void main(String[] args) {
		String [][] clothes = 
			{

					{"crowmask", "face"}
					, {"bluesunglasses", "face"}
					, {"smoky_makeup", "face"}
			
			
			};

		
		solution(clothes);
		
		
	}
	
	// 문제의 포인트는 경우의 수를 구하는 공식이다.
	// 합의 공식과 곱의 공식 중 곱의 공식을 사용한다.
	// 통상적으로는 A x B를 하면 각각 모두 선택했다고 가정한 경우의 수가 나온다.
	// 다만, A에서 안고르거나 B가 안골랐을 경우의 수가 있기 때문에 +1을 해주어 (A + 1) x (B + 1) 을 해준다.
	// 그런데 문제에서 보면 무조건 1개는 입고 나간다고 한다. 위의 공식에서는 모든 것을 선택하지 않았을 경우가 생기기에 - 1을 해준다.
	// 그것을 코드로 푼게 아래의 내용.
	
	public static int solution(String[][] clothes) {
		
		int answer = 0;

		Stack<String> stack = new Stack<String>();
		// 의상의 종류 구하기, 스택을 하나 선언하여 여기에 종류의 개수를 쌓아둔다.

		for (int i = 0; i < clothes.length; i++) {
			// 배열의 길이만큼 반복하여 스택에 없으면 push해서 쌓아둔다.
			if (stack.contains(clothes[i][1])) {
				continue;
			} else {
				stack.push(clothes[i][1]);
			}
		}
		
		System.out.println(stack.size());
		// 그럼 이게 의상 종류의 수가 된다.
		
		while(!stack.isEmpty()) {
			// 스택안이 비어있지 않을 때까지 반복
			int temp = 0;
			// 해당 종류의 개수가 몇개인지 담아줄 변수
			String kind = stack.pop();
			// 맨 마지막에 들어간 종류를 kind 변수에 초기화
			for (int i = 0; i < clothes.length; i++) {
				if (clothes[i][1].equals(kind)) {
					temp++;
				}
			}
			
			if (answer != 0) {
				answer *= (temp + 1);
			} else {
				answer += (temp + 1);
			}
			System.out.println(kind + " : " + temp);
			System.out.println("answer : " + answer);

		}
	
		
        
        return answer-1;
    }

}

package com.level02;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class printer {

	public static void main(String[] args) {
		int[] priorities = {2,1,3,2};
		int location = 2;				 
		
		solution(priorities, location);
	}
	
	public static int solution(int[] priorities, int location) {
        int answer = 0;
        
        Stack<Integer> print = new Stack<Integer>();
        // 우선순위 스택
        Stack<Character> printName = new Stack<Character>();
        // 우선순위의 문자열 스택 (숫자로는 비교가 어려우니??...)    
        List<Character> list = new ArrayList<Character>();
        // 우선순위의 최종 문자열 리스트
  
        for (int i = 0; i < priorities.length; i++) {
        // 우선순위들을 스택에 push해준다.
        	 print.push(priorities[i]);
        	 char name = 0;
        	 name += 65+i;
        	 // 이해하기 쉽게 A부터 순차적으로 넣었다.
        	 printName.push(name);
		}
        char res = printName.get(location);
        // 찾으려는 로케이션의 캐릭터 값
        System.out.println(printName);
        System.out.println("우선 순위 대기열 : " + print);
        
        while(!print.isEmpty()) {
        	// 스택이 비어있을 때까지 반복한다.
        	int temp = print.get(0);
        	char tempName = printName.get(0);
			// 맨 앞의 숫자를 temp와 tempName변수로 선언
			if (priorityChk(print, temp)) {
				print.push(temp);
				printName.push(tempName);
				// 현재 temp값을 가장 뒤로 넣는다.
				// 현재 tempName값을 가장 뒤로 넣는다.
				print.remove(0);
				printName.remove(0);
				// 그리고 가장 앞에 있는 숫자와 char를 지운다.
			} else {
				list.add(tempName);
				// 현재 temp를 list에 옮겨 담는다.
				// 현재 tempName를 list에 옮겨 담는다.
				print.remove(0);
				printName.remove(0);
				// 가장 앞의 숫자를 지운다.
				// 그리고 가장 앞에 있는 숫자와 char를 지운다.
			}
        }

        answer = resReturn(list, res);
        
        return answer;
    }
	
	public static boolean priorityChk(Stack<Integer> print, int temp) {
	// 우선순위인지 아닌지를 판별해주는 메소드
		
		for (int i = 0; i < print.size(); i++) {
			if (temp < print.get(i)) {
			// 꺼낸 문서의 우선 순위가 뒤의 우선순위 보다 작으면
				return true;
			}
		}
		return false;
	}
	
	public static int resReturn(List<Character> list, char res) {
	// 요청한 문서가 어느 위치에 있는지 찾아주는 메소드	
        for (int i = 0; i < list.size(); i++) {
			if (res == list.get(i)) {
				return i+1;
			}
		}
		return 0;
	}
	
}

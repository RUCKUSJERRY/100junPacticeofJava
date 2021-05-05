package com.level02;

import java.util.Arrays;

public class phoneNumList {

	public static void main(String[] args) {
		String[] phone_book = {"119", "97674223", "1195524421"};
		solution(phone_book);
	}
	
	public static boolean solution(String[] phone_book) {
        
        boolean answer = true;
        
        Arrays.sort(phone_book);
        // 숫자 오름차순으로 배열 정렬
        System.out.println(Arrays.toString(phone_book));
        for (int i = 0; i < phone_book.length-1; i++) {
        	// 배열의 길이 -1 만큼 for문 반복
        	if(phone_book[i+1].startsWith(phone_book[i])) {
        		// i+1이 i의 값을 포함한다면 false 리턴하기
        		answer = false;
				break;
        	}  	
		}
        System.out.println(answer); 
        return answer;
    }
	
}

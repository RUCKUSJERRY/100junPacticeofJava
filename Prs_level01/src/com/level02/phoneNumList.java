package com.level02;

import java.util.Arrays;

public class phoneNumList {

	public static void main(String[] args) {
		String[] phone_book = {"119", "97674223", "1195524421"};
		solution(phone_book);
	}

	public static boolean solution(String[] phone_book) {
        
        boolean answer = true;
        
       // Arrays.sort(phone_book);
        // 배열을 오름차순대로 정렬
        
        for (int i = 0; i < phone_book.length; i++) {
        	System.out.println(phone_book[i].length());
        	for (int j = 0; j < phone_book.length; j++) {
        		
        		System.out.println(phone_book[j].substring(0, phone_book[i].length()));
//				if(phone_book[i] == phone_book[j].substring(0, phone_book[i].length())) {
//					
//				}
			}
        	
		}
        
        
        return answer;
    }
	
}

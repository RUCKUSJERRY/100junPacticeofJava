package com.level02;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class DelPair {

	public static void main(String[] args) {
		DelPair res = new DelPair();
		res.solution("baabaa");

	}

	public int solution(String s) {
        int answer = -1;
        
            Stack<String> room = new Stack<String>();

        int pointer = 0;
         
        for (int i = 0; i < s.length(); i++) {
			System.out.println(room.isEmpty());
			System.out.println("room : " + room);
			System.out.println("i : " + i + " pointer : " + pointer);
			if (room.size() == 0) {
				room.push("" + s.charAt(i));
				pointer = 0;
			} else {
				String pop = room.pop();
				if (pop.equals("" + s.charAt(i))) {
					pointer--;
				} else {
					room.push(pop);
					room.push("" + s.charAt(i));
					pointer++;
				}
			}
			
			
			

		}
        
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(room.isEmpty());
//			System.out.println("room : " + room);
//			System.out.println(list.get(i));
//			System.out.println("i : " + i + " pointer : " + pointer);
//			if (room.size() == 0) {
//				room.push(list.get(i));
//				pointer = 0;
//			} else {
//				String pop = room.pop();
//				if (pop.equals(list.get(i))) {
//					pointer--;
//				} else {
//					room.push(pop);
//					room.push(list.get(i));
//					pointer++;
//				}
//			}
//			
//			
//			
//
//		}
		
		if (room.size() == 0) {
			answer = 1;
		} else {
			answer = 0;
		}
		System.out.println(room);
		System.out.println(answer);
           return answer;
        	
        }
        
	
}

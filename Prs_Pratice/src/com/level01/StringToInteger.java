package com.level01;

public class StringToInteger {

	public static void main(String[] args) {
		String s = "one4seveneight";
		
		solution(s);
	}
	
	public static int solution(String s) {
        int answer = 0;
        
        String [] text = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String [] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        
        for (int i = 0; i < text.length; i++) {
            s = s.replaceAll(text[i], num[i]);
        }
        
        System.out.println(s);
        answer = Integer.parseInt(s);
        return answer;
    }
	
}

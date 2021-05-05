package com.level01;

public class hidePhoneNum {
	
	public static void main(String[] args) {
		
		solution("010-1234-5678");
		
	}
	
    public static String solution(String phone_number) {
        String answer = "";
        
        for (int i = 0; i < phone_number.length()-4; i++) {
			answer += "*";
		}
        
        answer += phone_number.substring(phone_number.length()-4, phone_number.length());
        System.out.println(answer);
        return answer;
    }
}

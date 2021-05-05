package com.level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class completion {

	public static void main(String[] args) {
		String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa", "vinko", "filipa"};
		String[] completion = {"marina", "josipa", "nikola", "filipa", "vinko", "vinko"};
		
		System.out.println(solution(participant, completion));

	}


	public static String solution(String[] participant, String[] completion) {
		
		String answer = "";
		
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		answer = participant[Arrays.mismatch(participant, completion)];
		return answer;
	}

	
}

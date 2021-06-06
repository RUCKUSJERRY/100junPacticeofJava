package com.level01;

import java.util.HashSet;
import java.util.Set;

public class phoneketmon {

	public static void main(String[] args) {
		int [] nums = {3,1,2,3};
		solution(nums);

	}
	
	public static int solution(int[] nums) {
        int answer = 0;
        // Set에 주어진 nums들을 넣어줘서 중복을 제거한다.
        Set<Integer> set = new HashSet<Integer>();
        
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        // 가져갈 수 있는 폰켓몬 최대수
        int a = nums.length / 2;
        
        // 종류 최대수
        int b = set.size();
        
        // 가져갈 최대수가 종류의 최대수보다 작으면 가져갈 최대수 리턴 아니면 종류 최대수 리턴
        if (a < b) {
        
            answer = a;
            
        } else {
            answer = b;
        }

        return answer;
    }

}

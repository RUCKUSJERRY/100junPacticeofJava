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
        // Set�� �־��� nums���� �־��༭ �ߺ��� �����Ѵ�.
        Set<Integer> set = new HashSet<Integer>();
        
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        // ������ �� �ִ� ���ϸ� �ִ��
        int a = nums.length / 2;
        
        // ���� �ִ��
        int b = set.size();
        
        // ������ �ִ���� ������ �ִ������ ������ ������ �ִ�� ���� �ƴϸ� ���� �ִ�� ����
        if (a < b) {
        
            answer = a;
            
        } else {
            answer = b;
        }

        return answer;
    }

}

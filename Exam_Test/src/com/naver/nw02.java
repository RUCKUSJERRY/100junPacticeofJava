package com.naver;

import java.util.ArrayList;
import java.util.List;

public class nw02 {

	public static void main(String[] args) {

		String temp = "llttaattll";
		
		solution(temp);
		
	}
	
    public static String[] solution(String s) {
    	// �� ���� �������� �� ���� �������� ���ʴ�� ���ϸ鼭 ���� ������ ������.
    	
    	List<String> list = new ArrayList<String>();
    	
    	String temp1 = "";
    	String temp2 = "";
    	
    	int reverse = s.length() - 1;
    	
    	for (int i = 0; i < s.length(); i++) {
			
    		temp1 = temp1 + s.charAt(i);
    		temp2 = s.charAt(reverse) + temp2;
    		
    		if (temp1.equals(temp2)) {
    			list.add(temp1);
    			
    			temp1 = "";
    			temp2 = "";
    		}
    		
    		reverse--;
		}
    	
    	System.out.println(list);
    	String[] answer = new String [list.size()];
    	for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
    	  
        return answer;
    }

}

/*
 *���� ����
���ڿ� s�� �־��� ��, s�� ������ ���� ������ "���ڿ� ����"���� �ڸ��� �մϴ�. ��, �߸� "���ڿ� ����"�� �տ������� ������� s(1), s(2), s(3), ..., s(n)�̶�� ���� ��, ���� ������ �����ؾ� �մϴ�.

1 �� i �� (n+1)/2 �� ��� �ڿ��� i�� ���ؼ�, s(i) = s(n - i + 1)
���� ��� ���ڿ� "abcxyasdfasdfxyabc"�� "abc", "xy", "asdf", "asdf", "xy", "abc"�� �ڸ���, �� ���ڿ� ������ ������� s1, s2, s3, s4, s5, s6�̶�� �ϰڽ��ϴ�.

"abc" = s1
"xy" = s2
"asdf" = s3
"asdf" = s4
"xy" = s5
"abc" = s6
�̶�, s1 = s6, s2 = s5, s3 = s4�� �� ������ �����ϸ�, �̺��� �� ���� ������ "���ڿ� ����"���� �ڸ��鼭 ������ �����ϵ��� �ϴ� ����� �����ϴ�.

���ڿ� s�� �Ű������� �־��� ��, ���ǿ� �°� s�� "���ڿ� ����"���� �ڸ� �� ������� �迭�� ��� return �ϵ��� solution �Լ��� �ϼ����ּ���.

���ѻ���
���ڿ� s�� ���̴� 1 �̻� 1,000 �����Դϴ�.
s�� ���ĺ� �ҹ��ڷθ� �̷���� �ֽ��ϴ�.
����� ��
s	result
"abcxyasdfasdfxyabc"	["abc","xy","asdf","asdf","xy","abc"]
"abcxyqwertyxyabc"	["abc","xy","qwerty","xy","abc"]
"abcabcabcabc"	["abc","abc","abc","abc"]
"llttaattll"	["l","l","t","t","a","a","t","t","l","l"]
"zzzzzz"	["z","z","z","z","z","z"]
"abcdef"	["abcdef"]
����� �� ����
����� �� #1

���� ���ÿ� �����ϴ�.

����� �� #2

���ڿ��� "abc", "xy", "qwerty", "xy", "abc"�� �ڸ���, �� ���ڿ� ������ ������� s1, s2, s3, s4, s5��� �ϸ� s1 = s5, s2 = s4, s3 = s3�� �����մϴ�. �̺��� �� ���� ������ "���ڿ� ����"���� �ڸ��鼭 ������ �����ϵ��� �ϴ� ����� �����Ƿ�, ["abc","xy","qwerty","xy","abc"]�� return �մϴ�.

����� �� #3

���ڿ��� "abc", "abc", "abc", "abc"�� �ڸ���, �� ���ڿ� ������ ������� s1, s2, s3, s4��� �ϸ� s1 = s4, s2 = s3�� �����ϸ�, �̺��� �� ���� "���ڿ� ����"���� �ڸ��鼭 ������ �����ϵ��� �ϴ� ����� �����ϴ�.

���� ���ڿ��� "abcabc", "abcabc"�� �ڸ���, �� ���ڿ� ������ ������� s1, s2��� �ϸ� s1 = s2�� ����������, s�� ������ ���� ������ "���ڿ� ����"���� �߶�� �ϹǷ� �� ���� �������� �ڸ� ["abc","abc","abc","abc"]�� return �ؾ� �մϴ�.

����� �� #4, #5, #6

���� ���� 
 * 
 * 
 */
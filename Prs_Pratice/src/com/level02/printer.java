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
        // �켱���� ����
        Stack<Character> printName = new Stack<Character>();
        // �켱������ ���ڿ� ���� (���ڷδ� �񱳰� ������??...)    
        List<Character> list = new ArrayList<Character>();
        // �켱������ ���� ���ڿ� ����Ʈ
  
        for (int i = 0; i < priorities.length; i++) {
        // �켱�������� ���ÿ� push���ش�.
        	 print.push(priorities[i]);
        	 char name = 0;
        	 name += 65+i;
        	 // �����ϱ� ���� A���� ���������� �־���.
        	 printName.push(name);
		}
        char res = printName.get(location);
        // ã������ �����̼��� ĳ���� ��
        System.out.println(printName);
        System.out.println("�켱 ���� ��⿭ : " + print);
        
        while(!print.isEmpty()) {
        	// ������ ������� ������ �ݺ��Ѵ�.
        	int temp = print.get(0);
        	char tempName = printName.get(0);
			// �� ���� ���ڸ� temp�� tempName������ ����
			if (priorityChk(print, temp)) {
				print.push(temp);
				printName.push(tempName);
				// ���� temp���� ���� �ڷ� �ִ´�.
				// ���� tempName���� ���� �ڷ� �ִ´�.
				print.remove(0);
				printName.remove(0);
				// �׸��� ���� �տ� �ִ� ���ڿ� char�� �����.
			} else {
				list.add(tempName);
				// ���� temp�� list�� �Ű� ��´�.
				// ���� tempName�� list�� �Ű� ��´�.
				print.remove(0);
				printName.remove(0);
				// ���� ���� ���ڸ� �����.
				// �׸��� ���� �տ� �ִ� ���ڿ� char�� �����.
			}
        }

        answer = resReturn(list, res);
        
        return answer;
    }
	
	public static boolean priorityChk(Stack<Integer> print, int temp) {
	// �켱�������� �ƴ����� �Ǻ����ִ� �޼ҵ�
		
		for (int i = 0; i < print.size(); i++) {
			if (temp < print.get(i)) {
			// ���� ������ �켱 ������ ���� �켱���� ���� ������
				return true;
			}
		}
		return false;
	}
	
	public static int resReturn(List<Character> list, char res) {
	// ��û�� ������ ��� ��ġ�� �ִ��� ã���ִ� �޼ҵ�	
        for (int i = 0; i < list.size(); i++) {
			if (res == list.get(i)) {
				return i+1;
			}
		}
		return 0;
	}
	
}

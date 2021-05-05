package com.level02;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class functionDevlopment {

	public static void main(String[] args) {
			
		int[] progresses = {99,99,99,99,99,99};
		int[] speeds = {1,1,1,1,1,1};
			
		solution(progresses, speeds);
	}
	
	public static int[] solution(int[] progresses, int[] speeds) {
       
		Stack<Integer> stack = new Stack<Integer>();
        // ���� �ð��� ��� ���� 
		
        List<Integer> list = new ArrayList<Integer>();
        // ���� ��� ������ ��� ����Ʈ ���߿� answer �迭�� ��Ƽ� ������ ����
        
        	int day = 0;
        	// ���� �Ϸ� ����
        
        	for (int i = progresses.length-1; i >= 0; i--) {
			// �۾��� �迭 ���� ��ŭ �ݺ����� ������.
				int tempProgresses = progresses[i];
				// i������ �۾��� ��� ��Ƶδ� ��
				
				while (tempProgresses < 100) {
				// �ش� �۾����� 100���� ���� �� �۾��ӵ��� ���ϸ鼭 �ݺ��ϰ�, ���߿Ϸ����ڸ� ++���ش�
					tempProgresses += speeds[i];
					day++;
				}
				stack.add(day);
				// ���� �Ϸ� ���ڸ� ���ÿ� �����ش�.
				day = 0;
				// ���� ���� ���ڸ� ����ϱ����� 0���� �ʱ�ȭ.
			}

        	int count = 1;
        	// �ѹ��� ���� ������ ����

        	int temp = stack.pop();
        	// ������ ������ �����´�.
        	
        	while(!stack.isEmpty()) {
        	// ������ ������������� �ݺ��Ѵ�.
        		
        			if (temp >= stack.peek()) {
        			// ������ �����̶� �״��� ���� �� ���� �ִ� �����̶� ���ؼ�
        			// ������ ������ �� ũ�ų� ������
            			stack.pop();
            			// �����ְ�
            			count++;
            			// ī��Ʈ�� �����ش�.
            			if (stack.size() == 0) {
            			// ���࿡ ������ ��������� �����
            				list.add(count);
            				break;
            			}
            		} else {
            			
            			list.add(count);
            			// ����� ������ ������ ������츸 ������ �̶��� �׳� �ٷ� list�� �����ְ�
            			count = 1;
            			// ���߰��� ī��Ʈ�� 1�� �ʱ�ȭ�Ѵ�.
            			
            			if (stack.size() == 0) {
            				list.add(count);
            				break;
            			} else {
            			// �׸��� ���� ���� �� ��⿡ �ִ� �������ڸ� temp�� �ٽ� �������ְ�, pop���� �����ش�.
            				temp = stack.peek();
            				stack.pop();
            			}
            		}
        	}

        	// answer ������ ����Ʈ�� ������ ��ɹ��������� ����� �Ŀ� ����!
        	 int[] answer = new int[list.size()];
        	 
        	 for (int i = 0; i < list.size(); i++) {
				answer[i] = list.get(i);

			}
        	
        	 
        	return answer;
    }

}

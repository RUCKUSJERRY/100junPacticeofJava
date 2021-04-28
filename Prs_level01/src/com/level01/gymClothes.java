package com.level01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class gymClothes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10;
		
		int [] reserve = {1, 4, 8, 9};
		
		int [] lost = {2, 3, 6, 8, 10};
		
		solution(n, lost, reserve);
		
		
		
		
	}

	public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        int save = 0;
        // ���������� ��ã�� �ο���

        for (int i = 0; i < reserve.length; i++) {
		// �����ִ� �л��� ����ŭ �ݺ�����.
        	
        	for (int j = 0; j < lost.length; j++) {
        		if(reserve[i] == lost[j]) {
        		// ���࿡ �о���� �л��� ��ȣ�� ������ �л��� ��ȣ�� ���ٸ�
        			reserve[i] = -1;
        			lost[j] = -1;
        			save++;
        			
        		} 
			}
        	
        	for (int j = 0; j < lost.length; j++) {
				if (reserve[i] == -1) {
				// ���� -1�̸� �̹� �����ذŴϱ�� �Ұ� ���� �ǳ� ����
					continue;
				} else if (reserve[i] == lost[j] - 1 || reserve[i] == lost[j] + 1) {
					reserve[i] = -1;
        			lost[j] = -1;
        			save++;
				}
				
				
			}
        	
		}
        
        answer = n - lost.length + save;

        System.out.println("�Ҿ���� �л��迭 : " + Arrays.toString(lost));
        System.out.println("������ �л� �迭 : " + Arrays.toString(reserve));
        System.out.println(answer);
        return answer;
    }
	
}

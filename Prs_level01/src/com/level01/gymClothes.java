package com.level01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class gymClothes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 20;
		
		int [] reserve = {1,3,5,7,9,11,13,15,17,19};
		
		int [] lost = {2,4,7,8,10,11,14,16,17,20};
		
		solution(n, lost, reserve);

	}

	public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        int save = 0;
        // ���������� ��ã�� �ο���

        for (int i = 0; i < reserve.length; i++) {
		// �����ִ� �л��� ����ŭ �ݺ�����.
        	
        	for (int j = 0; j < lost.length; j++) {
        		if(reserve[i] == lost[j]) {
        		// ���࿡ �о���� �л��� ��ȣ�� ������ �л��� ��ȣ�� ���ٸ�
        			reserve[i] = -100;
        			lost[j] = -100;
        			save++;
        			
        		} 
			}
        	
        }
        
        System.out.println("�Ҿ���� �л��迭 : " + Arrays.toString(lost));
        System.out.println("������ �л� �迭 : " + Arrays.toString(reserve));
        
        for (int i = 0; i < reserve.length; i++) {
        // ������ �л����� ���־����� ���� ü������ �����ຸ��
        	for (int j = 0; j < lost.length; j++) {
				if (reserve[i] == -100) {
				// ���� -100�̸� �̹� �����ذŴϱ�� �Ұ� ���� �ǳ� ����
					
				} else if (reserve[i] == lost[j] - 1 || reserve[i] == lost[j] + 1) {
					reserve[i] = -100;
        			lost[j] = -100;
        			save++;
				}
				
				
			}
        	
		}
        
        answer = n - lost.length + save;

        System.out.println("�Ҿ���� �л��迭 : " + Arrays.toString(lost));
        System.out.println("������ �л� �迭 : " + Arrays.toString(reserve));
        System.out.println("ü���� ���� �л� �� : " + answer);
        return answer;
    }
	
}

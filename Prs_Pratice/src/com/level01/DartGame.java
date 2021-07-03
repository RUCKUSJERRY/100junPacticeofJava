package com.level01;

import java.util.ArrayList;
import java.util.List;

public class DartGame {

	public static void main(String[] args) {
		
		solution("1S2D*3T");
		
	}
	
    public static int solution(String dartResult) {
        int answer = 0;
        
        List<String> list = new ArrayList<String>();
        // ������ ��������� ��������Ʈ
        String res = "";
        for (int i = 0; i < dartResult.length(); i++) {
        	res += dartResult.charAt(i);
        	if (res.length() == 2) {
        	// res�� ���̰� 2��� (1S or 10 �̷������� ����Ǿ����� ��)
        		
        		if (res.equals("10")) {
        			// ������ 10�ΰ�쿡�� �ٷ� �ڿ� ���ʽ��� ���ؼ� ����Ʈ�� ���Ѵ�.
            		res += dartResult.charAt(i+1);
            		list.add(res);
            		res = "";
            		i++;
        		} else {
               		if (i < dartResult.length()-1) {
               		// �ƿ�����ٿ��� ����
                		if (dartResult.charAt(i+1) == '*' || dartResult.charAt(i+1) == '#') {
                    		res += dartResult.charAt(i+1);
                    		list.add(res);
                    		res = "";
                    		i++;
                    	} else {
                    		list.add(res);
                    		res = "";
                    	}
            			
            		} else if (i == dartResult.length()-1) {
            			// ������ ���� �� ���
                		list.add(res);
                		res = "";
            		}
        		}
        		
 
        	}

		}
        List<Integer> score = new ArrayList<Integer>();
        // ������ ���� ����Ʈ
        for (int i = 0; i < list.size(); i++) {
        // ������ ������ �ջ�����.
        	int point = Character.getNumericValue(list.get(i).charAt(0));
        	// �� ������ ����Ʈ�� �����´�
        	if (list.get(i).charAt(1) == 'D') {
        		point = point * point;
        	} else if (list.get(i).charAt(1) == 'T') {
        		point = point * point * point;
        	} else if (list.get(i).charAt(1) == '0') {
        		// ������ 10���� �椷
        		String ten = "";
        		ten += list.get(i).charAt(0);
        		ten += list.get(i).charAt(1);
        		point = Integer.parseInt(ten);
        		if (list.get(i).charAt(2) == 'D') {
        			point = point * point;
        		} else if (list.get(i).charAt(2) == 'T') {
        			point = point * point * point;
        		}
        	}
        	score.add(point);
		}
        
        for (int i = 0; i < list.size(); i++) {
			
        	if (list.get(i).length() == 3) {
        			
        		if (list.get(i).charAt(2) == '*') {
        			score.set(i, score.get(i) * 2);
        			if (i > 0) {
        				score.set(i-1, score.get(i-1) * 2);
        			}
        		} else if (list.get(i).charAt(2) == '#') {
        			score.set(i, score.get(i) * -1);
        		} 
        		
        	}
        	
		}
        
        for (int i = 0; i < score.size(); i++) {
        	answer += score.get(i);
		}
        return answer;
    }
    
	
}

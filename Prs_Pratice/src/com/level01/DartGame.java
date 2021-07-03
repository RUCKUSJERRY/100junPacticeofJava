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
        // 각각의 점수결과를 담을리스트
        String res = "";
        for (int i = 0; i < dartResult.length(); i++) {
        	res += dartResult.charAt(i);
        	if (res.length() == 2) {
        	// res의 길이가 2라면 (1S or 10 이런식으로 저장되어있을 것)
        		
        		if (res.equals("10")) {
        			// 점수가 10인경우에는 바로 뒤에 보너스를 더해서 리스트에 더한다.
            		res += dartResult.charAt(i+1);
            		list.add(res);
            		res = "";
            		i++;
        		} else {
               		if (i < dartResult.length()-1) {
               		// 아웃오브바운즈 방지
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
            			// 마지막 번지 일 경우
                		list.add(res);
                		res = "";
            		}
        		}
        		
 
        	}

		}
        List<Integer> score = new ArrayList<Integer>();
        // 점수를 담을 리스트
        for (int i = 0; i < list.size(); i++) {
        // 각각의 점수를 합산하자.
        	int point = Character.getNumericValue(list.get(i).charAt(0));
        	// 각 라운드의 포인트를 가져온다
        	if (list.get(i).charAt(1) == 'D') {
        		point = point * point;
        	} else if (list.get(i).charAt(1) == 'T') {
        		point = point * point * point;
        	} else if (list.get(i).charAt(1) == '0') {
        		// 점수가 10점인 경ㅇ
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

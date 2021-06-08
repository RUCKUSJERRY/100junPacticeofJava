package com.level01;

public class secretMap {

	public static void main(String[] args) {
		
		int [] arr1 = {9, 20, 28, 18, 11};
		int [] arr2 = {30, 1, 21, 17, 28};
		
		solution(5, arr1, arr2);

	}

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String [n];
        
        	// 각 지도의 2진수 결과를 담을 배열을 선언해준다.
        	String [] map1 = new String [n];
        	String [] map2 = new String [n];
        	
        	// 2진수로 변환한 값을 # or 공백의 형태로 넣어준다.
        	for (int i = 0; i < map1.length; i++) {
				map1[i] = getBinary(arr1[i], n);
				map2[i] = getBinary(arr2[i], n);
			}
        	
        	String res = "";
        	// 각 배열의 문자형을 비교하여 둘 중 하나라도 #이 있으면 #을 둘다 없으면 공백을 추가해준 후에 answer배열에 리턴한다.
        	for (int i = 0; i < map2.length; i++) {
				for (int j = 0; j < map2.length; j++) {
					if (map1[i].charAt(j) == '#' || map2[i].charAt(j) == '#') {
						res += "#";
					} else {
						res += " ";
					}
				}
				answer[i] = res;
				res = "";
				
			}
        
        return answer;
    }
	
    private static String getBinary(int num, int n) {
    	// 2진수로 변환한 값을 비교하여 # or 공백을 넣는 메소드
    	String temp = Integer.toBinaryString(num);
    	
    	String res = "";
    		
    		int count = 0;
    		for (int i = 0; i < n; i++) {
				
    			if (n - i > temp.length()) {
    				res += " ";
    			} else {
    				if (temp.charAt(count) == '1') {
    					res += "#";
    				} else {
    					res += " ";
    				}
    				count++;
    			}
    			
			}
    		count = 0;

    	return res;
    }
    
    
}

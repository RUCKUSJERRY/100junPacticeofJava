package com.level01;

public class secretMap {

	public static void main(String[] args) {
		
		int [] arr1 = {9, 20, 28, 18, 11};
		int [] arr2 = {30, 1, 21, 17, 28};
		
		solution(5, arr1, arr2);

	}

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String [n];
        
        	// �� ������ 2���� ����� ���� �迭�� �������ش�.
        	String [] map1 = new String [n];
        	String [] map2 = new String [n];
        	
        	// 2������ ��ȯ�� ���� # or ������ ���·� �־��ش�.
        	for (int i = 0; i < map1.length; i++) {
				map1[i] = getBinary(arr1[i], n);
				map2[i] = getBinary(arr2[i], n);
			}
        	
        	String res = "";
        	// �� �迭�� �������� ���Ͽ� �� �� �ϳ��� #�� ������ #�� �Ѵ� ������ ������ �߰����� �Ŀ� answer�迭�� �����Ѵ�.
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
    	// 2������ ��ȯ�� ���� ���Ͽ� # or ������ �ִ� �޼ҵ�
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

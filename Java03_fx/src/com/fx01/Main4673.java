package com.fx01;

import java.util.ArrayList;
import java.util.List;

public class Main4673 {

	public static int cal(int i) {
		
		String a = Integer.toString(i);
		int temp = 0;
		int res = 0;
		for (int j = 0; j < a.length(); j++) {
			
			temp = Character.getNumericValue(a.charAt(j));
			res += temp;
					
		}
		
		res += i;
		return res;
	}
	
	public static void main(String[] args) {	
		
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i < 10000; i++) {

			list.add(cal(i));
		}

		for (int i = 0; i < 10000; i++) {
			
			if (list.contains(i+1) == false) {
				System.out.println(i+1);
			}
			
		}

	}

}

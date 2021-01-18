package com.fx01;

import java.util.ArrayList;
import java.util.List;

public class Main4673 {
	
	static int con [] = new int [10000];

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
	
	public static boolean tf(int i) {
		
		boolean res = false;
		
		for (int j = 0; j < 10000; j++) {
			if (i == con[j]) {
				res = true;
				break;
			} 
		}
		
		return res;
	}
	
	public static void main(String[] args) {	
		
//		List<Integer> list = new ArrayList<Integer>();
//
//		for (int i = 1; i < 10000; i++) {
//
//			list.add(cal(i));
//		}
//
//		for (int i = 0; i < 10000; i++) {
//			
//			if (list.contains(i+1) == false) {
//				System.out.println(i+1);
//			}
//			
//		}
		
		
		
		//생성자 배열
		for (int i = 0; i < con.length; i++) {
			con[i] = cal(i+1);
		//	System.out.println(con[i]);
		}
		//트루, 펄스 리턴
		for (int i = 0; i < con.length; i++) {
			
			if (tf(i+1) != true) {
				System.out.println(i+1);
			}
			
		}

	}

}

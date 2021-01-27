package com.pratice01;

public class aaa {

	
	public static void main(String[] args) {
		
		String s = "복사대상";
		System.out.println("s : " + s);
		System.out.println("s의 주소 : " + s.hashCode());
		System.out.println();
		
		// 얕은 복사
			String a = "얕은복사";
			System.out.println("a : " + a);
			System.out.println("a의 주소 : " + a.hashCode());
			System.out.println();
			
			a = s;
			
			System.out.println("a : " + a);
			System.out.println("a의 주소 : " + a.hashCode());
			System.out.println("s : " + s);
			System.out.println("s의 주소 : " + s.hashCode());
			System.out.println();
			
		
		// 깊은 복사
			
			char [] b = new char[4];
			System.out.println("b의 주소 : " + b.hashCode());
			System.out.println();
			
			for (int i = 0; i < s.length(); i++) {
				b[i] = s.charAt(i);
				System.out.print(b[i]);
			}
			System.out.println();
			
			System.out.println("b의 주소 : " + b.hashCode());
			System.out.println("s : " + s);
			System.out.println("s의 주소 : " + s.hashCode());
		
		
	}
}

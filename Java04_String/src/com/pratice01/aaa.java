package com.pratice01;

public class aaa {

	
	public static void main(String[] args) {
		
		String s = "������";
		System.out.println("s : " + s);
		System.out.println("s�� �ּ� : " + s.hashCode());
		System.out.println();
		
		// ���� ����
			String a = "��������";
			System.out.println("a : " + a);
			System.out.println("a�� �ּ� : " + a.hashCode());
			System.out.println();
			
			a = s;
			
			System.out.println("a : " + a);
			System.out.println("a�� �ּ� : " + a.hashCode());
			System.out.println("s : " + s);
			System.out.println("s�� �ּ� : " + s.hashCode());
			System.out.println();
			
		
		// ���� ����
			
			char [] b = new char[4];
			System.out.println("b�� �ּ� : " + b.hashCode());
			System.out.println();
			
			for (int i = 0; i < s.length(); i++) {
				b[i] = s.charAt(i);
				System.out.print(b[i]);
			}
			System.out.println();
			
			System.out.println("b�� �ּ� : " + b.hashCode());
			System.out.println("s : " + s);
			System.out.println("s�� �ּ� : " + s.hashCode());
		
		
	}
}

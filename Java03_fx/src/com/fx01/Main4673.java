package com.fx01;

public class Main4673 {

	public static void main(String[] args) {
		
		int [] conArr = new int [10000];
		int a = 1;
		int con = 0;

		for (int i = 0; i < conArr.length; i++) {
			
			for (int j = 0; j < Integer.toString(a).length(); j++) {			
				con += Integer.toString(a).charAt(j);
				System.out.println(con);
			}
			con = con + a;
			conArr[i] = con;
			a++;
			con = 0;
			
		}
		System.out.println(conArr[0]);
		
		// �����ڸ� ���� ����� ���ڸ� ����ؼ� �迭�� ����ֱ�?

		// 1 ~ 10000 ���� �߿� ������� �ȳ��� ���ڵ��� ������� ���

		// d(x) = x + x1 + x2

	}

	// ������ �� ����
	public static void con() {
			
			
			
		}
		
	

}

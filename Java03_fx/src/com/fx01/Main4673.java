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
		
		// 생성자를 통해 결과값 숫자를 출력해서 배열에 집어넣기?

		// 1 ~ 10000 사이 중에 결과값에 안나온 숫자들을 순서대로 출력

		// d(x) = x + x1 + x2

	}

	// 생성자 값 도출
	public static void con() {
			
			
			
		}
		
	

}

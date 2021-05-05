package com.level02;

import java.util.Stack;

public class SpyClothes {

	public static void main(String[] args) {
		String [][] clothes = 
			{

					{"crowmask", "face"}
					, {"bluesunglasses", "face"}
					, {"smoky_makeup", "face"}
			
			
			};

		
		solution(clothes);
		
		
	}
	
	// ������ ����Ʈ�� ����� ���� ���ϴ� �����̴�.
	// ���� ���İ� ���� ���� �� ���� ������ ����Ѵ�.
	// ��������δ� A x B�� �ϸ� ���� ��� �����ߴٰ� ������ ����� ���� ���´�.
	// �ٸ�, A���� �Ȱ��ų� B�� �Ȱ���� ����� ���� �ֱ� ������ +1�� ���־� (A + 1) x (B + 1) �� ���ش�.
	// �׷��� �������� ���� ������ 1���� �԰� �����ٰ� �Ѵ�. ���� ���Ŀ����� ��� ���� �������� �ʾ��� ��찡 ����⿡ - 1�� ���ش�.
	// �װ��� �ڵ�� Ǭ�� �Ʒ��� ����.
	
	public static int solution(String[][] clothes) {
		
		int answer = 0;

		Stack<String> stack = new Stack<String>();
		// �ǻ��� ���� ���ϱ�, ������ �ϳ� �����Ͽ� ���⿡ ������ ������ �׾Ƶд�.

		for (int i = 0; i < clothes.length; i++) {
			// �迭�� ���̸�ŭ �ݺ��Ͽ� ���ÿ� ������ push�ؼ� �׾Ƶд�.
			if (stack.contains(clothes[i][1])) {
				continue;
			} else {
				stack.push(clothes[i][1]);
			}
		}
		
		System.out.println(stack.size());
		// �׷� �̰� �ǻ� ������ ���� �ȴ�.
		
		while(!stack.isEmpty()) {
			// ���þ��� ������� ���� ������ �ݺ�
			int temp = 0;
			// �ش� ������ ������ ����� ����� ����
			String kind = stack.pop();
			// �� �������� �� ������ kind ������ �ʱ�ȭ
			for (int i = 0; i < clothes.length; i++) {
				if (clothes[i][1].equals(kind)) {
					temp++;
				}
			}
			
			if (answer != 0) {
				answer *= (temp + 1);
			} else {
				answer += (temp + 1);
			}
			System.out.println(kind + " : " + temp);
			System.out.println("answer : " + answer);

		}
	
		
        
        return answer-1;
    }

}

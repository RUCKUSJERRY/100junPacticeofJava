package com.commit01;

import java.util.Scanner;

public class entNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("���̼���");
		System.out.println("������ ����Ͻðڽ��ϱ�?");
		int n = sc.nextInt();
		
		String line = "1";
		String next = "";
		
		// nextLine �޼ҵ� -> ���������� ���� String���� ������ִ°�
		// numberCnt -> 1�� ����� 2�� ����� 3�� ����� �׶��׶� ��Ʈ������ ����ؼ� nextLine �޼ҵ�� �����ִ� �޼ҵ�
		
		
		for (int i = 0; i < n; i++) {
			System.out.println(line);
			next = nextLine(line);
			line = next;
			
		}
		
	}
	// ���� ������ ����ϴ� �޼ҵ�
	public static String nextLine(String line) {
	
		String next = ""; 
		for (int i = 0; i < line.length(); i++) {
			if (i > 0) {
				if (line.charAt(i) == line.charAt(i-1)) {
					continue;
				}
			}				
			next += numberCnt(line, i);
		}
		
		return next;
	}
	
	// ���ڸ� ���� ����ϴ� �޼ҵ�
	public static String numberCnt(String line, int n) {
		
		char str = line.charAt(n);
		int count = 0;
		
		for (int i = n; i < line.length(); i++) {
			if (str == line.charAt(i)) {
				count++;
			} else {
				break;
			}
		}
		
		return str + Integer.toString(count);
	}
	
}

package com.commit01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean res = false;
		
		// true �϶����� �ݺ��ؼ� �Է��ϰ� �ϱ�
		while (res != true) {
		
		String in = br.readLine();
		String out = "";
		
		// �Էµ� ���� �Ųٷ� ���
		for (int i = in.length() - 1; i >= 0; i--) {
			out += in.charAt(i);
		}	
		// �������� �Ųٷ� ���� ��
		// true or false ����
			if (in.equals(out)) {
				res = true;
				System.out.println(res + "!! ȸ���Դϴ�.");
				break;
			} else {
				System.out.println(res + "!! ȸ���� �ƴմϴ�. �ٽ� �Է����ּ���.");
				res = false;
				
			}
		}
		
		
	}
	
}

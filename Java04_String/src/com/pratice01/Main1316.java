package com.pratice01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1316 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int count = 0;

		for (int i = 0; i < n; i++) {
			if (cntGroup(br.readLine())) {
				count++;
			}
		}

		System.out.println(count);

	}

	public static boolean cntGroup(String s) {
		
		boolean res = true;
		
		char now = 0; // b
		int start = 0; // �� �ܾ �׷�ܾ� ���ǿ� �´ٸ�, �� �����ܾ��� ���� �ε���
		int set = 0; // �������� �ƴ� ������ ���� ã��

		// �ƽ�Ű�ڵ�� a ~ z����.
			// aabb (4)
			if (s.length() == 1) {
				res = true;
			} else {
				
				for (int j = start; j < s.length(); j++) {
					// now�� �ε��� j������ ���� �־��ְ� ������.
					now = s.charAt(j);

					// charAt(k) �� now�� Ʋ���������� �ε��� ���� ã��.
					// �׸��� Ʋ�� ������ k + 1�� ã�ƾ��� �ε��� ���� �����̴�.
					for (int k = start; k < s.length(); k++) {
						if (s.charAt(k) != now) {
							start = k;
							set = k + 1;
							break;
						} else {
							set = k + 1;
							
						}
						
						
					}
					// set(k+1)�� �ε��� ���� ���ڿ��� ���̱��� now�� �������� ������ �׷�ܾ X, ������ �׷�ܾ�
					// �ٵ� set�� ���� s.length() ���� ũ�� �׷�ܾ�
					
					if (set == s.length()) {
						res = true;
						break;
					} else if (set < s.length()){
						for (int j2 = set; j2 < s.length(); j2++) {
							if (s.charAt(j2) == now) {
								return false;
							} else {
								
							}
						}
						
					}
	
					
				}
				
			}
			


		return res;
	}

}

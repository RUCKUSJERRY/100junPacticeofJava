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
		int start = 0; // 한 단어가 그룹단어 조건에 맞다면, 그 다음단어의 시작 인덱스
		int set = 0; // 같은값이 아닌 시작점 부터 찾기

		// 아스키코드로 a ~ z까지.
			// aabb (4)
			if (s.length() == 1) {
				res = true;
			} else {
				
				for (int j = start; j < s.length(); j++) {
					// now에 인덱스 j번지의 값을 넣어주고 비교하자.
					now = s.charAt(j);

					// charAt(k) 로 now와 틀릴때까지의 인덱스 값을 찾자.
					// 그리고 틀린 순간의 k + 1이 찾아야할 인덱스 값의 시작이다.
					for (int k = start; k < s.length(); k++) {
						if (s.charAt(k) != now) {
							start = k;
							set = k + 1;
							break;
						} else {
							set = k + 1;
							
						}
						
						
					}
					// set(k+1)의 인덱스 부터 문자열의 길이까지 now와 같은값이 있으면 그룹단어가 X, 없으면 그룹단어
					// 근데 set의 값이 s.length() 보다 크면 그룹단어
					
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

package com.array01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2562 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [] arr = new int[9];
		int max = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			arr[i] = Integer.parseInt(st.nextToken());
			
			if (arr[i] > max) {
				max = arr[i];
				count = i+1;
			}
			
		}
		br.close();
		System.out.println(max);
		System.out.println(count);
		
	}

}

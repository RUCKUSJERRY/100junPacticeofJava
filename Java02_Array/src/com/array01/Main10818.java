package com.array01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main10818 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int [] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++) {		
			int a = Integer.parseInt(st.nextToken());
			arr[i] = a;
		}
		Arrays.sort(arr);
		System.out.print(arr[0] + " " + arr[arr.length-1]);
		
		br.close();
	}

}

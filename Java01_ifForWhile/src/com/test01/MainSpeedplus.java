package com.test01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class MainSpeedplus {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
	
		for (int i = 0; i < n; i++) {

			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			int res = a + c;
			
			bw.write(String.valueOf(res));
			
		}

		bw.flush();
		bw.close();
	}

}

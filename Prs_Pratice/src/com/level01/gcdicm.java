package com.level01;

public class gcdicm {

	public static void main(String[] args) {
		solution(2, 5);	
	}

    public static int[] solution(int n, int m) {
        int[] answer = new int [2];

        int max = gcd(n , m);
        int min = icm(n , m);

        answer[0] = max;
        answer[1] = min;
        System.out.println(answer[0]);
        System.out.println(answer[1]);
        return answer;
    }
	
	public static int gcd(int a, int b) {
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}

	public static int icm(int a, int b) {
		return a * b / gcd(a, b);
	}

}

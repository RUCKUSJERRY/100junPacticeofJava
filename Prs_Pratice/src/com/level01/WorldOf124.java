package com.level01;

public class WorldOf124 {

	public static void main(String[] args) {
		WorldOf124 res = new WorldOf124();
		res.solution(10);

	}
	
	public String solution(int n) {
        String answer = "";
        int num = n;
        int chk = 0;
        while (num != 0) {
            chk = num % 3;
            num = num / 3;
            if (chk == 0) {
               num--;
               answer = "4" + answer;
            } else if (chk == 1) {
               answer = "1" + answer;
            } else if (chk == 2) {
               answer = "2" + answer;
            }

        }

        return answer;
    }

}

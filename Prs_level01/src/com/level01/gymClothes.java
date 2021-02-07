package com.level01;

public class gymClothes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10;
		int [] lost = {1,3,6,9};
		int [] reserve = {2,5,8};
		
		solution(n, lost, reserve);
		
	}

	public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        answer = n - lost.length;
        
        
        for (int i = 0; i < reserve.length; i++) {
			for (int j = 0; j < lost.length; j++) {
				if (reserve[i] == lost[i]) {
					break;
				} else if (reserve[i] == lost[i] - 1 || reserve[i] == lost[i] + 1){ 
					if (reserve[i] == lost[i] - 1) {
						System.out.println("reserve[i] : " + reserve[i]);
						System.out.println("lost[i] - 1 : " + (lost[i] - 1));
						answer++;
						if (reserve[i+1] == lost[i] + 1) {
							i++;
						}
						break;
					} else if (reserve[i] == lost[i] + 1) {
						System.out.println("reserve[i] : " + reserve[i]);
						System.out.println("lost[i] + 1 : " + (lost[i] + 1));
						answer++;
						break;
					}
				}
			}
		}
        
        System.out.println(answer);
        
        return answer;
    }
	
}

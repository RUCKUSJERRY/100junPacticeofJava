package com.level01;

public class createPrimeNum {

	// 1로 나누어 떨어지면서
	// 자기 자신으로 나누어 떨어지면서
	// 다른 수로는 안나누어 떨어지는거
	
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7};
		
		solution(nums);
	}
	
	    public static int solution(int[] nums) {
	    	int answer = 0;
	    	
	    	// 3중 포문으로 3개씩 더할 수 있는 모든 경우의 수를 구해준다.
	    	
	    	for (int i = 0; i < nums.length-2; i++) {
	    	// 3개씩 더해야 하니 첫 번째 포문은 배열 길이의 -2번만 돌릴거다. 그럼 여기서는 0,1,2 까지 총 3번 반복한다.
				for (int j = i+1; j < nums.length-1; j++) {
				// 2번째 포문은 첫번째 포문 시작 점+1부터 배열 길이의 -1번 만 돌릴거다. 그럼 여기서는 1,2,3 까지 총 3번 반복한다.
					for (int k = j+1; k < nums.length; k++) {
					// 3번째 포문은 두번째 포문 시작점 +1부터 배열 길이까지 돌릴거다. 그럼 여기서는 2,3,4 까지 총 3번 반복한다.
						int temp = nums[i] + nums[j] + nums[k];

						System.out.println("i : " + i + " j : " + j + " k : " + k);
						
						if (primeCheck(temp)) {
							answer++;
						}

					}
				}
			}
	    	System.out.println(answer);
	        return answer;
	    }
	    
		public static boolean primeCheck(int n) {
			// 소수 판별
			boolean prime = true;
				for (int i = 2; i < n; i++) {
					if (n % i == 0) {
						prime = false;
						break;
					}
				}		
			return prime;
		}
	    
	}
	


package com.level01;

public class createPrimeNum {

	// 1�� ������ �������鼭
	// �ڱ� �ڽ����� ������ �������鼭
	// �ٸ� ���δ� �ȳ����� �������°�
	
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7};
		
		solution(nums);
	}
	
	    public static int solution(int[] nums) {
	    	int answer = 0;
	    	
	    	// 3�� �������� 3���� ���� �� �ִ� ��� ����� ���� �����ش�.
	    	
	    	for (int i = 0; i < nums.length-2; i++) {
	    	// 3���� ���ؾ� �ϴ� ù ��° ������ �迭 ������ -2���� �����Ŵ�. �׷� ���⼭�� 0,1,2 ���� �� 3�� �ݺ��Ѵ�.
				for (int j = i+1; j < nums.length-1; j++) {
				// 2��° ������ ù��° ���� ���� ��+1���� �迭 ������ -1�� �� �����Ŵ�. �׷� ���⼭�� 1,2,3 ���� �� 3�� �ݺ��Ѵ�.
					for (int k = j+1; k < nums.length; k++) {
					// 3��° ������ �ι�° ���� ������ +1���� �迭 ���̱��� �����Ŵ�. �׷� ���⼭�� 2,3,4 ���� �� 3�� �ݺ��Ѵ�.
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
			// �Ҽ� �Ǻ�
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
	


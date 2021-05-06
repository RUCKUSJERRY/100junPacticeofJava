package com.level02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class findPrimeNum {

	public static void main(String[] args) {
		
		String numbers = "123";
		
		solution(numbers);
		
	}
	
	public static int solution(String numbers) {
        int answer = 0;
        
        Set<Integer> set = new HashSet<Integer>();
        
        char arr [] = new char [numbers.length()];
        
        for (int i = 0; i < arr.length; i++) {
			arr[i] = numbers.charAt(i);
		}
        // char 배열을 만들어서 길이만큼 담아준다.
        
        for (int i = 0; i < arr.length; i++) {
        	if (i == 0) {
        		set.addAll(count1(arr));
        	} else if (i == 1) {
        		set.addAll(count2(arr));
        	} else if (i == 2) {
        		set.addAll(count3(arr));
        	} else if (i == 3) {
        		set.addAll(count4(arr));
        	} else if (i == 4) {
        		set.addAll(count5(arr));
        	} else if (i == 5) {
        		set.addAll(count6(arr));
        	} else if (i == 6) {
        		set.addAll(count7(arr));
        	}	
		}   
        
        Iterator<Integer> itr = set.iterator();
        
        while (itr.hasNext()) {
        	if(primeCheck(itr.next())) {
        		answer++;
        	}
        }
        
        System.out.println(set);
        System.out.println(answer);
        return answer;
    }
	
	public static boolean primeCheck(int n) {
		// 소수 판별
		boolean prime = true;
		
		if (n <= 1) {
			prime = false;
		} else {
			for (int i = 3; i < n; i+=2) {
				if (n % i == 0) {
					prime = false;
					break;
				}
			}
		}			
		return prime;
	}
	
	public static Set<Integer> count1(char [] arr) {	
        // 1개씩 비교한 경우의 수
		Set<Integer> countSet = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
        	
        	int chkNum = Character.getNumericValue(arr[i]);
        	countSet.add(chkNum);
		}
		return countSet;
	}
	
	public static Set<Integer> count2(char [] arr) {
		// 2개씩 묶은 경우의 수
		Set<Integer> countSet = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j || arr[i] == '0') {
					continue;
				} else {
					String temp = arr[i] + "" + arr[j];
					int chkNum = Integer.parseInt(temp);
					countSet.add(chkNum);
				}	
			}
		}
		return countSet;
	}
	
	public static Set<Integer> count3(char [] arr) {
        // 3개씩 묶은 경우의 수
		Set<Integer> countSet = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				for (int k = 0; k < arr.length; k++) {
					if (i == j || j == k || i == k || arr[i] == '0') {
						continue;
					} else {
						String temp = arr[i] + "" + arr[j] + "" + arr[k];
						int chkNum = Integer.parseInt(temp);
						countSet.add(chkNum);
					}	
				}			
			}
		}
		return countSet;
	}
	
	public static Set<Integer> count4(char [] arr) {
        // 4개씩 묶은 경우의 수
		Set<Integer> countSet = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				for (int k = 0; k < arr.length; k++) {
					for (int k2 = 0; k2 < arr.length; k2++) {
						if (i == j || j == k || i == k || k == k2 || k2 == j || k2 == i) {
							continue;
						} else {
							String temp = arr[i] + "" + arr[j] + "" + arr[k] + "" + arr[k2];
							int chkNum = Integer.parseInt(temp);
							countSet.add(chkNum);
						}
					}	
				}
			}
		}
		return countSet;
	}
	
	public static Set<Integer> count5(char [] arr) {
        // 5개씩 묶은 경우의 수
		Set<Integer> countSet = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				for (int k = 0; k < arr.length; k++) {
					for (int k2 = 0; k2 < arr.length; k2++) {
						for (int l = 0; l < arr.length; l++) {
							if (i == j || i == k || i == k2 || i == l || j == k || j == k2 || j == l || 
								k == k2 || k == l || k2 == l) {
								continue;
							} else {
								String temp = arr[i] + "" + arr[j] + "" + arr[k] + "" + arr[k2] + "" + arr[l];
								int chkNum = Integer.parseInt(temp);
								countSet.add(chkNum);
							}
						}
					}	
				}
			}
		}
		return countSet;
	}
	
	public static Set<Integer> count6(char [] arr) {
        // 6개씩 묶은 경우의 수
		Set<Integer> countSet = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				for (int k = 0; k < arr.length; k++) {
					for (int k2 = 0; k2 < arr.length; k2++) {
						for (int l = 0; l < arr.length; l++) {
							for (int l2 = 0; l2 < arr.length; l2++) {
								if (i == j || i == k || i == k2 || i == l || i == l2 ||
										j == k || j == k2 || j == l || j == l2 ||
										k == k2 || k == l || k == l2 ||
										k2 == l || k2 == l2 ||
										l == l2) {
										continue;
									} else {
										String temp = arr[i] + "" + arr[j] + "" + arr[k] + "" + arr[k2] + "" + arr[l] + "" + arr[l2];
										int chkNum = Integer.parseInt(temp);
										countSet.add(chkNum);
									}
							}		
						}				
					}	
				}
			}
		}
		return countSet;
	}
	
	public static Set<Integer> count7(char [] arr) {
        // 7개씩 묶은 경우의 수
		Set<Integer> countSet = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				for (int k = 0; k < arr.length; k++) {
					for (int k2 = 0; k2 < arr.length; k2++) {
						for (int l = 0; l < arr.length; l++) {
							for (int l2 = 0; l2 < arr.length; l2++) {
								for (int m = 0; m < arr.length; m++) {
									if (i == j || i == k || i == k2 || i == l || i == l2 || i == m ||
											j == k || j == k2 || j == l || j == l2 || j == m ||
											k == k2 || k == l || k == l2 || k == m ||
											k2 == l || k2 == l2 || k2 == m ||
											l == l2 || l == m ||
											l2 == m) {
											continue;
										} else {
											String temp = arr[i] + "" + arr[j] + "" + arr[k] + "" + arr[k2] + "" + arr[l] + "" + arr[l2] + "" + arr[m];
											int chkNum = Integer.parseInt(temp);
											countSet.add(chkNum);
										}
								}
							}		
						}				
					}	
				}
			}
		}
		return countSet;
	}

}

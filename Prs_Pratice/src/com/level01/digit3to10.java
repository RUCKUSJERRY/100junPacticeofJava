package com.level01;

public class digit3to10 {

	public static void main(String[] args) {
		
		digit3to10 digit = new digit3to10();
		digit.solution(45);
		
	}
	
	 public int solution(int n) {
	        int answer = 0;
	        
	        String digit3 = get3digit(n);
	        System.out.println(digit3);
	        
	        answer = get10digit(digit3);
	        
	        return answer;
	    }
	    
	    public String get3digit(int n) {
	        
	        String res = "";
	        
	        while(n > 0) {
	            
	            res += Integer.toString(n % 3);
	            n = n / 3;
	        }
	        
	        return res;
	    }
	    
	    public int get10digit(String digit3) {
	        
	        int res = 0;
	        
	        for (int i = 0; i < digit3.length(); i++ ) {
	            
	            int digit = Character.getNumericValue(digit3.charAt(i));
	            
	            res += digit * Math.pow(3, digit3.length()-i-1);

	        }
	       
	        return res;
	        
	    }

}

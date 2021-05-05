package com.level01;

public class pandy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "P";
		
		solution(s);
	}
	
	static boolean solution(String s) {
        boolean answer = true;
        
        int pcnt = 0;
        int ycnt = 0;
    
        s = s.toLowerCase();
        System.out.println(s);
        
        for (int i = 0; i < s.length(); i++){
            
            if (s.charAt(i) == 'p') {
                pcnt++;
            } else if (s.charAt(i) == 'y'){
                ycnt++;
            }
   
        }
        
        if (pcnt != ycnt) {
            answer = false;
        } else {
            answer = true;
        }
        
        System.out.println(answer);
        return answer;
    }
	
}

package com.level01;

public class newId {

	public static void main(String[] args) {
		
		String new_id = "=.=";
				// "z-+.^.";
				// "...!@BaT#*..y.abcdefghijklm";
		
		solution(new_id);
	}
	
	public static String solution(String new_id) {
        String answer = "";
        String temp = "";
	// 1�ܰ� new_id�� ��� �빮�ڸ� �����Ǵ� �ҹ��ڷ� ġȯ�մϴ�.
        
       for (int i = 0; i < new_id.length(); i++) {
    	   
    	   if ((65 <= new_id.charAt(i)) && (new_id.charAt(i) <= 90)) {
    		   answer += Character.toLowerCase(new_id.charAt(i));
    	   } else {
    		   answer += new_id.charAt(i); 
    	   }
    	   
       }
       System.out.println("1�ܰ� : " + answer);     
        
	// 2�ܰ� new_id���� ���ĺ� �ҹ���, ����, ����(-), ����(_), ��ħǥ(.)�� ������ ��� ���ڸ� �����մϴ�.
       	for (int i = 0; i < answer.length(); i++) {      		
    	   switch (answer.charAt(i)) {
    	   case 'a':
    		   temp += 'a';
    		   break;   
    	   case 'b':
    		   temp += 'b';
    		   break;   
    	   case 'c':
    		   temp += 'c';
    		   break;   
    	   case 'd':
    		   temp += 'd';
    		   break;   
    	   case 'e':
    		   temp += 'e';
    		   break;   
    	   case 'f':
    		   temp += 'f';
    		   break;   
    	   case 'g':
    		   temp += 'g';
    		   break;   
    	   case 'h':
    		   temp += 'h';
    		   break;   
    	   case 'i':
    		   temp += 'i';
    		   break;   
    	   case 'j':
    		   temp += 'j';
    		   break;   
    	   case 'k':
    		   temp += 'k';
    		   break;   
    	   case 'l':
    		   temp += 'l';
    		   break;   
    	   case 'm':
    		   temp += 'm';
    		   break;   
    	   case 'n':
    		   temp += 'n';
    		   break;   
    	   case 'o':
    		   temp += 'o';
    		   break;   
    	   case 'p':
    		   temp += 'p';
    		   break;   
    	   case 'q':
    		   temp += 'q';
    		   break;   
    	   case 'r':
    		   temp += 'r';
    		   break;   
    	   case 's':
    		   temp += 's';
    		   break;   
    	   case 't':
    		   temp += 't';
    		   break;   
    	   case 'u':
    		   temp += 'u';
    		   break;   
    	   case 'v':
    		   temp += 'v';
    		   break;   
    	   case 'w':
    		   temp += 'w';
    		   break;   
    	   case 'x':
    		   temp += 'x';
    		   break;   
    	   case 'y':
    		   temp += 'y';
    		   break;   
    	   case 'z':
    		   temp += 'z';
    		   break;   
    	   case '-':
    		   temp += '-';
    		   break;   
    	   case '_':
    		   temp += '_';
    		   break;   
    	   case '.':
    		   temp += '.';
    		   break;   
    	   case '0':
    		   temp += '0';
    		   break;   
    	   case '1':
    		   temp += '1';
    		   break;   
    	   case '2':
    		   temp += '2';
    		   break;   
    	   case '3':
    		   temp += '3';
    		   break;   
    	   case '4':
    		   temp += '4';
    		   break;   
    	   case '5':
    		   temp += '5';
    		   break;   
    	   case '6':
    		   temp += '6';
    		   break;   
    	   case '7':
    		   temp += '7';
    		   break;   
    	   case '8':
    		   temp += '8';
    		   break;   
    	   case '9':
    		   temp += '9';
    		   break;   
    	   default:
    		   break;
    	   }  	   
       }
       	
       	answer = temp;  
       	temp = "";
       	System.out.println("2�ܰ� : " + answer);   
	// 3�ܰ� new_id���� ��ħǥ(.)�� 2�� �̻� ���ӵ� �κ��� �ϳ��� ��ħǥ(.)�� ġȯ�մϴ�.
       	for (int i = 0; i < answer.length(); i++) {
			if (i >= 1 && answer.charAt(i) == '.' && answer.charAt(i-1) == '.') {
				continue;
			} else { 
				temp += answer.charAt(i);
			}
		}
       	answer = temp;
       	temp = "";
       	System.out.println("3�ܰ� : " + answer);
       	
	// 4�ܰ� new_id���� ��ħǥ(.)�� ó���̳� ���� ��ġ�Ѵٸ� �����մϴ�.
       	
       	for (int i = 0; i < answer.length(); i++) {
			if (i == 0 && answer.charAt(i) == '.') {
				continue;
			} else if (i == answer.length()-1 && answer.charAt(answer.length()-1) == '.') {
				continue;
			} else {
				temp += answer.charAt(i);
			}

		}       	
       	answer = temp;
       	temp = "";
       	System.out.println("4�ܰ� : " + answer);
	// 5�ܰ� new_id�� �� ���ڿ��̶��, new_id�� "a"�� �����մϴ�.
       	if (answer == null || answer == "") {
       		
       		answer = "a";
       	}
       	System.out.println("5�ܰ� : " + answer);
	// 6�ܰ� new_id�� ���̰� 16�� �̻��̸�, new_id�� ù 15���� ���ڸ� ������ ������ ���ڵ��� ��� �����մϴ�.
       	if (answer.length() > 15) {
       		for (int i = 0; i < 15; i++) {
				temp += answer.charAt(i);
			}
       		answer = temp;
           	temp = "";
           	System.out.println("6�ܰ� : " + answer);      	
       	}
       	
    // ���� ���� �� ��ħǥ(.)�� new_id�� ���� ��ġ�Ѵٸ� ���� ��ġ�� ��ħǥ(.) ���ڸ� �����մϴ�.

       	if (answer.charAt(answer.length()-1) == '.') {
       		for (int i = 0; i < answer.length()-1; i++) {
    				temp += answer.charAt(i);
    		}
       		answer = temp;
           	temp = "";
           	System.out.println("6�ܰ� : " + answer);   
       	}
       	   	
	// 7�ܰ� new_id�� ���̰� 2�� ���϶��, new_id�� ������ ���ڸ� new_id�� ���̰� 3�� �� ������ �ݺ��ؼ� ���� ���Դϴ�.
       	if (answer.length() == 2) {
       		temp += answer.charAt(0);
       		temp += answer.charAt(1);
       		temp += answer.charAt(1);
       		
       		answer = temp;
           	temp = "";
           	System.out.println("7�ܰ� : " + answer);   
       		
       	} else if (answer.length() == 1) {
       		temp += answer.charAt(0);
       		temp += answer.charAt(0);
       		temp += answer.charAt(0);  
       		
       		answer = temp;
           	temp = "";
           	System.out.println("7�ܰ� : " + answer);   
       		
       	} 
        
        return answer;
    }
	
	
	
}

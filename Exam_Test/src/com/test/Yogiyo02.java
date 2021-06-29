package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Yogiyo02 {

	public static void main(String[] args) {
		
		String s = 
		"  root r-x delete-this.xls\n  "
		+ "root r-- bug-report.pdf\n  "
		+ "root r-- doc.xls\n  "
		+ "root r-- podcast.flac\n "
		+ "alice r-- system.xls\n  "
		+ "root --x invoices.pdf\n "
		+ "admin rwx SETUP.PY";
		
		// r : 읽기
		// w : 쓰기
		// x : 실행허용
		// perm은 길이 3
		// owner는 사용자 이며 길이는 6
		// name 은 길이 제한 없음
		
		solution(s);
		
	}
	
    public static String solution(String S) {
    	String [] commands = S.split("\n");
    	System.out.println(Arrays.toString(commands));
    	// 엔터로 명령어를 구분
    	List<String> list = new ArrayList<String>();
    	for (int i = 0; i < commands.length; i++) {
    		String[] command = commands[i].trim().split(" ");
    		// 공백으로 명령어 각각 구분
	
    		if (command[0].equals("root")) {
    		// 사용자가 루트인 파일들	
    			
    			if (command[1].equals("r--")) {
    			// 읽기 전용인 경우
    				list.add(command[2]);
    			}
    			
    		}
    		
		}
    	
    	String first = list.get(0);
    	
    	for (int i = 0; i < list.size(); i++) {
			
    		if(list.get(i).length() < first.length()) {
    			first = list.get(i);
    		}
		}

    	String res = "";
    	res += first.length();

        return res;
     }
	

}

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
		
		// r : �б�
		// w : ����
		// x : �������
		// perm�� ���� 3
		// owner�� ����� �̸� ���̴� 6
		// name �� ���� ���� ����
		
		solution(s);
		
	}
	
    public static String solution(String S) {
    	String [] commands = S.split("\n");
    	System.out.println(Arrays.toString(commands));
    	// ���ͷ� ��ɾ ����
    	List<String> list = new ArrayList<String>();
    	for (int i = 0; i < commands.length; i++) {
    		String[] command = commands[i].trim().split(" ");
    		// �������� ��ɾ� ���� ����
	
    		if (command[0].equals("root")) {
    		// ����ڰ� ��Ʈ�� ���ϵ�	
    			
    			if (command[1].equals("r--")) {
    			// �б� ������ ���
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

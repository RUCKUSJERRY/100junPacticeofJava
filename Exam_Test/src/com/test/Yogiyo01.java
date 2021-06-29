package com.test;

import java.util.ArrayList;
import java.util.List;

public class Yogiyo01 {

	public static void main(String[] args) {
		
		solution(
		"John Doe; Peter Benjamin Parker; Mary Jane Watson-Parker; John Elvis Doe; John Evan Doe; Jane Doe; Peter Brian Parker", "Example");
		
	}

	public static String solution(String S, String C) {
       
		// ��� �ҹ��ڷ� ��ȯ

		String tolower = S.toLowerCase();
		String company = C.toLowerCase();
			
		// �̸��� ,�� �����Ͽ� ����Ʈ�� ���
		String [] names = tolower.split("; ");

		List<String> list = getNames(names);

		String res = "";
		
		for (int i = 0; i < list.size(); i++) {
			
			if (i == list.size()-1) {
				res += list.get(i)+"@"+company+".com";
			} else {
				res += list.get(i)+"@"+company+".com; ";
			}

		}
		System.out.println(res);
		return res;
    }
	
	public static String getLastName(String lastname) {
		String res = "";		
		for (int i = 0; i < lastname.length(); i++) {
			if (res.length() < 8) {
			// ������ ���� ���̰� 8�����̴�
				if (lastname.charAt(i) == '-') {
					//���� �������� �ִٸ�? �Ѿ��
					continue;
				} else {
					res += lastname.charAt(i);
				}
			}
		}
		return res;
	}
	
	public static List<String> getNames(String [] names) {
		String firstname = "";
		String lastname = "";
		
		String [] res = new String [names.length];
		// firstname.lastname �� ���·� �迭�� ��´�.
		
		List<String> list = new ArrayList<String>();

		for (int j = 0; j < names.length; j++) {
			String [] name = names[j].split(" ");
			
				if (name.length == 2) {
				firstname = name[0];
				lastname = getLastName(name[1]);
				res[j] = firstname+"."+lastname;
			} else {
				firstname = name[0];
				lastname = getLastName(name[name.length-1]);
				res[j] = firstname+"."+lastname;
			}
		}

		for (int i = 0; i < res.length; i++) {
			
			String name = res[i];
			int count = getSameNameCount(list, res[i]);
			
			if (count > 0) {
				count = count + 1;
				list.add(name+count);
			} else {
				list.add(name);
			}
		}

		return list;
	}
	
	public static int getSameNameCount(List<String> list, String name) {
		// �ش� ����Ʈ�� ���� �̸��� � �ִ���??
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			if (name.length() < list.get(i).length()) {
				// ���࿡ ���� ����Ʈ�� ��� ���ڿ��� ���̰� �Ķ���ͷ� �־��� �̸��� ���̺��� ũ�ٸ� �߶�´�. �� ���� ��
				String temp = list.get(i).substring(0, name.length());
				if (temp.equals(name)) {
					count++;
				}
			} else {
				// �׷��� �ʴٸ� �׳� ��?
				if (list.get(i).equals(name)) {
					count++;
				}
			}
		}
		return count;
	}
	
}

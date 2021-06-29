package com.test;

import java.util.ArrayList;
import java.util.List;

public class Yogiyo01 {

	public static void main(String[] args) {
		
		solution(
		"John Doe; Peter Benjamin Parker; Mary Jane Watson-Parker; John Elvis Doe; John Evan Doe; Jane Doe; Peter Brian Parker", "Example");
		
	}

	public static String solution(String S, String C) {
       
		// 모두 소문자로 변환

		String tolower = S.toLowerCase();
		String company = C.toLowerCase();
			
		// 이름을 ,로 구분하여 리스트에 담기
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
			// 마지막 성은 길이가 8이하이다
				if (lastname.charAt(i) == '-') {
					//성에 하이픈이 있다면? 넘어가라
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
		// firstname.lastname 의 형태로 배열에 담는다.
		
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
		// 해당 리스트에 같은 이름이 몇개 있는지??
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			if (name.length() < list.get(i).length()) {
				// 만약에 현재 리스트에 담긴 문자열의 길이가 파라미터로 주어진 이름의 길이보다 크다면 잘라온다. 그 다음 비교
				String temp = list.get(i).substring(0, name.length());
				if (temp.equals(name)) {
					count++;
				}
			} else {
				// 그렇지 않다면 그냥 비교?
				if (list.get(i).equals(name)) {
					count++;
				}
			}
		}
		return count;
	}
	
}

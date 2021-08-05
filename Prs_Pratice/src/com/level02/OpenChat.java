package com.level02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OpenChat {

	public static void main(String[] args) {
		OpenChat oc = new OpenChat();
		oc.solution(new String[] {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"});
	}
	
	public String[] solution(String[] record) {
		System.out.println(record[0].contains("Enter"));
		
		Map<String, String> userNicks = new HashMap<String, String>();
		List<String []> logs = new ArrayList<String []>();
		String[] log = null; 
		String command = null; 
		String uid = null; 
		String nickname = null;
		for (int i = 0; i < record.length; i++) {
			log = record[i].split(" ");
			command = log[0];
			uid = log[1];
			if (command.equals("Enter")) {
				nickname = log[2];
				userNicks.put(uid, nickname);
				logs.add(new String []{uid, command});
			} else if (command.equals("Change")) {
				nickname = log[2];
				userNicks.put(uid, nickname);
			} else {
				logs.add(new String []{uid, command});
			}
			
		}
		String answer [] = new String[logs.size()];
		String lastnick = null;
		for (int i = 0; i < logs.size(); i++) {
			uid = logs.get(i)[0];
			command = logs.get(i)[1];
			lastnick = userNicks.get(uid);

			if (command.equals("Enter")) {
				answer[i] = lastnick + "´ÔÀÌ µé¾î¿Ô½À´Ï´Ù.";
			} else {
				answer[i] = lastnick + "´ÔÀÌ ³ª°¬½À´Ï´Ù.";
			}
			
		}
		
		
		return answer;
	}

}

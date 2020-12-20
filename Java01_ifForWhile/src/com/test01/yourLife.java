package com.test01;

import java.util.Scanner;

public class yourLife {

	// 몇살까지 살고 싶은지 희망 나이
	// 현재 나이
	// 빼앗긴 나이 생명을 앗아가는 요소들 (술, 담배, 커피)
	// 희망 나이 - 빼앗긴 나이 = 죽는 나이
	// 희망 나이 - 빼앗긴 나이 - 현재 나이 = 남은 나이
	// 죽는 나이 > 남은 나이 = 이미 뒤지셔야 되겠는데요?
	// 죽는 나이 < 남은 나이 = 00년 00일 후에 뒤지실듯 ㅎㅎ

	// remainingLife 여생
	// ageOfDeath 사망나이
	// 평균 나이 83.3 남자 80.3 여자 86.3
	// reducedAge 줄어든 나이
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("이름을 입력해주세요.");
		String name = sc.nextLine();
	
		System.out.println("성별을 입력해주세요. (남성 or 여성)");
		String sex = sc.nextLine();
		
		System.out.println("태어난 년도를 입력해주세요.");
		int bornYear = sc.nextInt();
		
		System.out.println("1개월에 담배를 몇 갑 피시나요? ex) 1갑, 2갑 반올림 부탁드립니다.");
		int tabaco = sc.nextInt();
		System.out.println("몇년 동안 담배를 피우셨나요?");
		int tabacoYear = sc.nextInt();
		
		System.out.println("1개월에 술을 몇 병 마시나요? ex) 소주기준 1병, 2병 반올림 부탁드립니다." );
		int drink = sc.nextInt();
		System.out.println("몇년 동안 술을 마셨나요?");
		int drinkYear = sc.nextInt();
		
		
		// 평균연령
		int normalAge = 0;
		if (sex.equals("남성")) {
			normalAge = 80;
		} else if (sex.equals("여성")) {
			normalAge = 86;
		}
		// 현재나이
		int age = 0;
		age = 2020 - bornYear + 1;
		// 줄어든 나이
		// 담배 1개피에 5분 * 20 = 100분 1.6
		// 1갑에 200분
		// 1갑 1년 200 * 365
		// 술 1병에 5분 
		double reduceTabaco = 0;
		double reduceDrink = 0;
		double rAge = 0;
		reduceTabaco = ((tabaco * 1.6) * (tabacoYear * 365)) / 24;
		reduceDrink = ((drink * 0.1) * (drinkYear * 365)) / 24;
		rAge = ((reduceTabaco + reduceDrink) / 365);
		
		double rLife = 0;
		rLife = normalAge - age - rAge;
		
		System.out.println(sex + "의 평균연령은 " + normalAge + "입니다.");
		System.out.println(name + "씨 당신의 나이는 " + age + "세 입니다.");
		System.out.println("흡연 음주로 인해 당신은 " + rAge + "년 만큼 잃었습니다.");
		System.out.println("당신은 " + rLife + "년 후에 죽습니다.");
		
	

		
		
}
	
}

package com.test01;

import java.util.Scanner;

public class yourLife {

	// ������ ��� ������ ��� ����
	// ���� ����
	// ���ѱ� ���� ������ �Ѿư��� ��ҵ� (��, ���, Ŀ��)
	// ��� ���� - ���ѱ� ���� = �״� ����
	// ��� ���� - ���ѱ� ���� - ���� ���� = ���� ����
	// �״� ���� > ���� ���� = �̹� �����ž� �ǰڴµ���?
	// �״� ���� < ���� ���� = 00�� 00�� �Ŀ� �����ǵ� ����

	// remainingLife ����
	// ageOfDeath �������
	// ��� ���� 83.3 ���� 80.3 ���� 86.3
	// reducedAge �پ�� ����
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("�̸��� �Է����ּ���.");
		String name = sc.nextLine();
	
		System.out.println("������ �Է����ּ���. (���� or ����)");
		String sex = sc.nextLine();
		
		System.out.println("�¾ �⵵�� �Է����ּ���.");
		int bornYear = sc.nextInt();
		
		System.out.println("1������ ��踦 �� �� �ǽó���? ex) 1��, 2�� �ݿø� ��Ź�帳�ϴ�.");
		int tabaco = sc.nextInt();
		System.out.println("��� ���� ��踦 �ǿ�̳���?");
		int tabacoYear = sc.nextInt();
		
		System.out.println("1������ ���� �� �� ���ó���? ex) ���ֱ��� 1��, 2�� �ݿø� ��Ź�帳�ϴ�." );
		int drink = sc.nextInt();
		System.out.println("��� ���� ���� ���̳���?");
		int drinkYear = sc.nextInt();
		
		
		// ��տ���
		int normalAge = 0;
		if (sex.equals("����")) {
			normalAge = 80;
		} else if (sex.equals("����")) {
			normalAge = 86;
		}
		// ���糪��
		int age = 0;
		age = 2020 - bornYear + 1;
		// �پ�� ����
		// ��� 1���ǿ� 5�� * 20 = 100�� 1.6
		// 1���� 200��
		// 1�� 1�� 200 * 365
		// �� 1���� 5�� 
		double reduceTabaco = 0;
		double reduceDrink = 0;
		double rAge = 0;
		reduceTabaco = ((tabaco * 1.6) * (tabacoYear * 365)) / 24;
		reduceDrink = ((drink * 0.1) * (drinkYear * 365)) / 24;
		rAge = ((reduceTabaco + reduceDrink) / 365);
		
		double rLife = 0;
		rLife = normalAge - age - rAge;
		
		System.out.println(sex + "�� ��տ����� " + normalAge + "�Դϴ�.");
		System.out.println(name + "�� ����� ���̴� " + age + "�� �Դϴ�.");
		System.out.println("�� ���ַ� ���� ����� " + rAge + "�� ��ŭ �Ҿ����ϴ�.");
		System.out.println("����� " + rLife + "�� �Ŀ� �׽��ϴ�.");
		
	

		
		
}
	
}

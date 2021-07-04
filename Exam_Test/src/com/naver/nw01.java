package com.naver;

import java.util.Arrays;

public class nw01 {

	public static void main(String[] args) {
		int[] prices = {32000, 18000, 42500};
		int[] discounts = {50, 20, 65};
		
		solution(prices, discounts);
	}
	
    public static int solution(int[] prices, int[] discounts) {
        int answer = 0;
        
        	Arrays.sort(prices);
        	Arrays.sort(discounts);
        	
        	System.out.println(Arrays.toString(prices));
        	System.out.println(Arrays.toString(discounts));
        
        	int discountsLength = discounts.length-1;
        	for (int i = prices.length-1; i >= 0; i--) {

        		if (discountsLength >= 0) {
        			int price = prices[i];
        			double discount = discounts[discountsLength] / 100.0;
        			
        			int pay = price - (int) (price * discount);
        			
        			answer += pay;

        			discountsLength--;
        		} else {
        			answer += prices[i];
        		}

			}
        	
        	System.out.println(answer);
        return answer;
    }

}



/*
 * 
 * 
 * ���� ����
������ ����ϸ� ������ �� �� ������ ���� �� �ֽ��ϴ�. ������ ���� �� �־����� ��, ������ ������ ����� ������ �ִ��� ���� �������� �մϴ�. �� ��ǰ���� ������ �ϳ��� ������ �� ������, ����� ������ ������ϴ�.

�ֹ��� ��ǰ�� ���� prices, ������ ������ discounts�� �Ű������� �־����ϴ�. ������ �ִ��� ���� �޵��� ������ �������� �� �󸶸� ���� �ϴ��� return �ϵ��� solution �Լ��� �ϼ����ּ���.

���� ����
prices �迭�� ���̴� 1 �̻� 1,000 �����Դϴ�.
prices �迭�� ���Ҵ� 5,000 �̻� 150,000 ������ �ڿ����̸�, �׻� 100���� ������ �������ϴ�.
discounts �迭�� ���̴� 1 �̻� 1,000 �����Դϴ�.
discounts �迭�� ���Ҵ� 1 �̻� 100 ������ �ڿ����Դϴ�.
����� ��
prices	discounts	result
[13000, 88000, 10000]	[30, 20]	82000
[32000, 18000, 42500]	[50, 20, 65]	45275
����� �� ����
����� �� #1

13,000��¥�� ��ǰ�� 20% ������ ������ 10,400���� �����մϴ�.
88,000��¥�� ��ǰ�� 30% ������ ������ 61,600���� �����մϴ�.
10,000��¥�� ��ǰ���� ������ �������� �ʽ��ϴ�.

���� 82,000���� ���� �մϴ�.

����� �� #2

32,000��¥�� ��ǰ�� 50% ������ ������ 16,000���� �����մϴ�.
18,000��¥�� ��ǰ�� 20% ������ ������ 14,400���� �����մϴ�.
42,500��¥�� ��ǰ�� 65% ������ ������ 14,875���� �����մϴ�.

���� 45,275���� ���� �մϴ�.
 */


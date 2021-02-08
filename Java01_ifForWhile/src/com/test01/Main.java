package com.test01;

import java.util.Iterator;

public class Main{

    public static void main(String[] args) {
    	
    	for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(i+1 + " ");
			}
			System.out.println();
		}
    	
    	System.out.println();
    	
    	for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(j+1 + " ");
			}
			System.out.println();
		}
    	
    	System.out.println();
    	
    	for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(j+1 + " ");
			}
			System.out.println();
		}
    	System.out.println();
    	
    	for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5-i; j++) {
				System.out.print(j+1 + " ");
			}
			System.out.println();
		}
    	
    	System.out.println();
    	
    	for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i+1; j++) {
				System.out.print((j+1));
			}
			
			System.out.println();
		}
    	

    	
    }
}

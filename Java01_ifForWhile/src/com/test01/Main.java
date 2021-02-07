package com.test01;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt(); 

        int nh = 0;  
        int nm = 0;

        if (h < 24 && h >= 0) {
            if (m < 60 && m > 0) {
                if (m < 45) {
                    if (h == 0) {
                        nh = 23;
                        nm = m + 15;
                    } else {
                        nh= h -1;
                        nm = m + 15;
                    }
                }else {
                    nh=h;
                    nm = m -45;
                }
            }
        }
        System.out.println(nh + " " + nm);
    }
}

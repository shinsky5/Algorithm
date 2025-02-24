package org.example.Lv.Lv8;


import java.util.Scanner;

public class Q2720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();

        int q = 0;
        int d = 0;
        int n = 0;
        int p = 0;

        for (int i = 0; i < cnt; i++) {
            int a = sc.nextInt();

            q = a/25;
            d = (a-(25*q))/10;
            n = (a-(25*q)-(10*d))/5;
            p = (a-(25*q)-(10*d)-(5*n));

            System.out.println(q+" "+d+" "+n+" "+p);
        }
    }
}

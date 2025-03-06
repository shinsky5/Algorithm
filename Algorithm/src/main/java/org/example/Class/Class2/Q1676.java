package org.example.Class.Class2;

import java.util.Scanner;

public class Q1676 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int cnt = 0;

        while (a >= 5) {
            cnt += a/5;
            a /=5;
        }
        System.out.println(cnt);
    }
}

package org.example.Lv.Lv12;

import java.util.Scanner;

public class Q19532 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();

        int x = ((b * f) - (c * e)) / ((b * d) - (a * e));
        int y = ((a * f) - (d * c)) / ((a * e) - (d * b));

        System.out.println(x+" "+y);
    }
}


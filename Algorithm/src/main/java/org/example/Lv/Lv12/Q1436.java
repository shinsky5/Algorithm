package org.example.Lv.Lv12;

import java.util.Scanner;

public class Q1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 3666;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }

    }
}
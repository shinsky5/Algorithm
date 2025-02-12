package org.example.Lv6;

import java.util.Scanner;

public class Q2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            for (int k = a-i-1; k > 0; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = a - 1; i > 0; i--) {
            for (int k = a-i; k > 0; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i * 2 - 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
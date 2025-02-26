package org.example.Lv.Lv12;

import java.util.Scanner;

public class Q2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rst = 0;

        for (int i = 0; i <= 1000; i++) {
            for (int j = 0; j <= 1666; j++) {
                int sum = 5*i + 3*j;
                if (sum == n) {
                    rst = i+j;
                }
            }
        }
        if (rst != 0) {
            System.out.println(rst);
        }else{
            System.out.println(-1);
        }
    }
}

package org.example.Lv.Lv12;

import java.util.Scanner;

public class Q2231_gpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int rst = 0;
        for (int i = 0; i < m; i++) {
            int num = i;
            int sum = 0;

            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }

            if (sum+i == m) {
                if (rst == 0) {
                    rst = i;
                }
            }
        }
        System.out.println(rst);
    }
}

package org.example.Lv.Lv12;

import java.util.Scanner;

public class Q2231 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        int rst =0;

        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    for (int q = 0; q <= 9; q++) {
                        for (int w = 0; w <= 9; w++) {
                            for (int e = 0; e <= 9; e++) {
                                if (m == (100001 * i) + (10001 * j) + (1001 * k) + (101 * q) + (11 * w) + (2*e)) {
                                    if (rst == 0) {
                                        rst = (100000 * i) + (10000 * j) + (1000 * k) + (100 * q) + (10 * w) + (e);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(rst);
    }
}

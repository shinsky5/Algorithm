package org.example.Lv.Lv10;

import java.util.Arrays;
import java.util.Scanner;

public class Q9063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] xrr = new int[n];
        int[] yrr = new int[n];

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            xrr[i] = a;
            yrr[i] = b;
        }

        Arrays.sort(xrr);
        Arrays.sort(yrr);

        int garo = xrr[xrr.length - 1] - xrr[0];
        int sero = yrr[yrr.length - 1] - yrr[0];

        System.out.println(garo * sero);
    }
}

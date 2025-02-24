package org.example.Lv.Lv10;

import java.util.Arrays;
import java.util.Scanner;

public class Q3009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] xrr = new int[3];
        int[] yrr = new int[3];

        for (int i = 0; i < xrr.length; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            xrr[i] = x;
            yrr[i] = y;
        }

        Arrays.sort(xrr);
        Arrays.sort(yrr);

        int x_rst = 0;
        int y_rst = 0;

        if (xrr[0] == xrr[1]) {
            x_rst = xrr[2];
        }else{
            x_rst = xrr[0];
        }

        if (yrr[0] == yrr[1]) {
            y_rst = yrr[2];
        }else{
            y_rst = yrr[0];
        }

        System.out.println(x_rst+" "+y_rst);
    }
}

package org.example.Tear.BronzeV;

import java.util.Arrays;
import java.util.Scanner;

public class Q2475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.pow(sc.nextInt(),2);
        }

        int rst = 0;
        for (double d : arr) {
            rst += (int)d;
        }

        System.out.println(rst%10);
    }
}

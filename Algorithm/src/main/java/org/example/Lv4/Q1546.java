package org.example.Lv4;

import java.util.Arrays;
import java.util.Scanner;

public class Q1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        int[] arr = new int[cnt];
        double[] arrD = new double[cnt];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            arrD[i] = arr[i];
        }

        Arrays.sort(arrD);


        for (int i = 0; i < arrD.length; i++) {
            arrD[i] = arrD[i]/arrD[arrD.length-1]*100;
        }
        double rst =0;
        for (double i : arrD) {
            rst += i;
        }

        System.out.println(rst/cnt);
    }
}

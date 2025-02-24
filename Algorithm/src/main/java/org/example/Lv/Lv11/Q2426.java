package org.example.Lv.Lv11;

import java.util.Arrays;
import java.util.Scanner;

public class Q2426 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            arr[i] = a;
        }

        Arrays.sort(arr);

    }
}

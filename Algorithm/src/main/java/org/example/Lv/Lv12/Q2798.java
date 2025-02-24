package org.example.Lv.Lv12;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Q2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int max = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            arr[i] = a;
        }

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    int sum = arr[i]+arr[j]+arr[k];
                    if (sum <= m) {
                        if (max < sum) {
                            max = sum;
                        }
                    }
                }
            }
        }

        System.out.println(max);
    }
}

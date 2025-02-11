package org.example.Lv4;

import java.util.*;

public class Q3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();
            arr[i] = a%42;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i>j)) {
                    if (arr[i] == arr[j]) {
                        arr[j] = 42;
                    }
                }
            }
        }

        int cnt = 0;
        for (int i : arr) {
            if (i != 42) {
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}

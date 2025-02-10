package org.example.Lv4;

import java.util.*;

public class Q3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        Map<Integer,Integer> rst = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();
            arr[i] = a%42;
        }

        Arrays.sort(arr);

        for (int i : arr) {
            System.out.print(i+" ");
        }



    }
}

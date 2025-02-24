package org.example.Lv.Lv4;

import java.util.Scanner;

public class Q10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < m; i++) {
            int q = sc.nextInt();
            int w = sc.nextInt();
            int e = sc.nextInt();
            for(int j = 0;j < arr.length; j++){
                if ((j >= q-1) && (j <= w-1)) {
                    arr[j] = e;
                }
            }
        }

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}

package org.example.Lv.Lv4;

import java.util.Scanner;

public class Q10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int ch = 0;

        for (int i = n-1; i >= 0; i--) {
            arr[i] = n;
            n--;
        }

        for (int i = 0; i < m; i++) {
            int q = sc.nextInt();
            int w = sc.nextInt();
            for (int j = 0; j < arr.length; j++) {
                if(j == (q-1)){
                    ch = arr[q-1];
                    arr[q-1] = arr[w-1];
                }
                if (j == (w - 1)) {
                    arr[w-1] =ch;
                }
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

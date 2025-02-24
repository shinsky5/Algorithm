package org.example.Lv.Lv4;

import java.util.Arrays;
import java.util.Scanner;

public class Q10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int[] brr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
            brr[i] = i+1;
        }

        for (int i = 0; i < m; i++) {
            int q = sc.nextInt()-1;
            int w = sc.nextInt()-1;

            if((w-q)==1||(w - q) == 2){
                brr[q] = arr[w];
                brr[w] = arr[q];
            } else if((w-q)==3||(w - q) == 4) {
                brr[q] = arr[w];
                brr[q+1] = arr[w-1];
                brr[w-1] = arr[q+1];
                brr[w] = arr[q];
            }
            arr = Arrays.copyOf(brr, 5);
        }
        sc.close();

        for (int i : brr) {
            System.out.print(i+" ");
        }
    }
}

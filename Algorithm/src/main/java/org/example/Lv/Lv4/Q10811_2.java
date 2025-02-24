package org.example.Lv.Lv4;

import java.util.Scanner;

public class Q10811_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }

        for (int i = 0; i < m; i++) {
            int q = sc.nextInt()-1;
            int w = sc.nextInt()-1;

            copy(arr,q,w);
        }
        sc.close();

        for (int i : arr) {
            System.out.print(i +" ");
        }
    }

    public static void copy(int[] arr, int q, int w) {
        while(q<w){
            int tmp = arr[q];
            arr[q++]=arr[w];
            arr[w--]=tmp;
        }
    }
}

package org.example.Lv.Lv8;

import java.util.Arrays;
import java.util.Scanner;

public class Q2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[1000000000][];
        arr[0] = new int[]{1};

        for (int i = 1; i < arr.length; i++) {
            arr[i] = new int[i*6];
            for (int k = 0; k < arr[i].length; k++) {
                if (k == 0) {
                    arr[i][k] = arr[i-1][arr[i-1].length-1]+1;
                }else{
                    arr[i][k] = arr[i][k-1]+1;
                }
            }
        }

        for (int i = 1; i < arr.length; i++) {
            for (int k = 0; k < arr[i].length; k++) {
                if (arr[i][k] == n) {
                    System.out.println(i+1);
                }
            }
        }
    }
}

package org.example.Lv.Lv7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[9][9];

        for (int i = 0; i < arr.length; i++) {
            String str = br.readLine();
            String[] srr = str.split(" ");
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Integer.parseInt(srr[j]);
            }
        }
        int max = 0;
        int n = 0;
        int m = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    n = i+1;
                    m = j+1;
                }
            }
        }
        System.out.println(max);
        System.out.print(n + " "+m);
    }
}

package org.example.Lv.Lv15;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Q2485 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int first = arr[1] - arr[0];
        int sec = arr[2] - arr[1];
        int min = euc(first, sec);

        HashSet<Integer> set = new HashSet<>();

    }

    public static int euc(int a, int b) {
        if (b == 0) {
            return a;
        }else{
            return euc(b, a % b);
        }
    }
}

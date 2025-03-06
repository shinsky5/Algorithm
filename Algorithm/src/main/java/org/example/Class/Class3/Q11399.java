package org.example.Class.Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String[] srr = br.readLine().split(" ");
        int[] arr = new int[srr.length];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(srr[i]);
        }
        Arrays.sort(arr);

        int rst = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                rst += arr[j];
            }
        }
        sb.append(rst);
        System.out.println(sb.toString());
    }
}

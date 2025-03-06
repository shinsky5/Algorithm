package org.example.Class.Class2;

import java.io.*;
import java.util.Arrays;

public class Q18110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        long cut = Math.round((float) n * 0.15);
        System.out.println(cut);

        int[] arr = new int[n];


        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        for (int i = 0; i < cut; i++) {
            arr[i] =0;
            arr[arr.length-1-i] = 0;
        }


        int sum = 0;
        int cnt = 0;

        for (int i : arr) {
            if (i != 0) {
                sum+=i;
                cnt++;
            }
        }
        System.out.println(Math.round((float) sum /cnt));
    }
}

package org.example.Lv6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1157_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine().toUpperCase();
        int[] arr = new int[26];

        int n = 0;
        for (int i = 0; i < str.length(); i++) {
            n = str.charAt(i) - 'A';
            arr[n]++;
        }

        int max = 0;
        char ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
                ans = (char)(i+'A');
            } else if (max == arr[i]) {
                ans = '?';
            }
        }

        System.out.println(ans);
    }
}

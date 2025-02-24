package org.example.Lv.Lv10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] srr = str.split(" ");

        int x = Integer.parseInt(srr[0]);
        int y = Integer.parseInt(srr[1]);
        int w = Integer.parseInt(srr[2]);
        int h = Integer.parseInt(srr[3]);

        int a = h - y;
        int b = w - x;

        int[] arr = {x, y, a, b};
        Arrays.sort(arr);
        System.out.println(arr[0]);
    }
}

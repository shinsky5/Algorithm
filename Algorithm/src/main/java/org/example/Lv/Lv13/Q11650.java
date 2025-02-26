package org.example.Lv.Lv13;

import java.io.*;

public class Q11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] xrr = new int[n];
        int[] yrr = new int[n];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            String[] srr = str.split(" ");
            xrr[i] = Integer.parseInt(srr[0]);
            yrr[i] = Integer.parseInt(srr[1]);
        }



    }
}

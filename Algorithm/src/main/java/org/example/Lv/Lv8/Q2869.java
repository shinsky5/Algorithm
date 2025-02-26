package org.example.Lv.Lv8;

import java.io.*;

public class Q2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] srr = br.readLine().split(" ");
        int a = Integer.parseInt(srr[0]);
        int b = Integer.parseInt(srr[1]);
        int v = Integer.parseInt(srr[2]);

        int day = (v - a) / (a - b)+1;
        bw.write(String.valueOf(day));
        bw.flush();
    }
}

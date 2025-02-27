package org.example.Lv.Lv15;

import java.io.*;
import java.util.StringTokenizer;

public class Q1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int a = 0;
        int b = 0;
        int rst = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            rst = euc(b, a);
            System.out.println((a*b)/rst);
        }


    }

    public static int euc(int a, int b) {
        if (b == 0) {
            return a;
        }else{
            return euc(b, a % b);
        }
    }
}


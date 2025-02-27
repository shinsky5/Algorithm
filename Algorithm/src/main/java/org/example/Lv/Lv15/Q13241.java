package org.example.Lv.Lv15;

import java.io.*;
import java.util.StringTokenizer;

public class Q13241 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        bw.write(String.valueOf((a*b)/euc(b,a)));
        bw.flush();

    }

    public static long euc(long a, long b) {
        if (b == 0) {
            return a;
        } else {
            return euc(b, a % b);
        }
    }
}
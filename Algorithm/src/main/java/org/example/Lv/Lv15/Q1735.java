package org.example.Lv.Lv15;

import java.io.*;
import java.util.StringTokenizer;

public class Q1735 {
    public static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int top = a * d + b * c;
        int bot = b*d;
        int max = euc(top, bot);

        bw.write(top/max+" "+bot/max);
        bw.flush();

    }

    public static int euc(int a, int b) {
        if (b == 0) {
            return a;
        }else{
            return euc(b, a % b);
        }
    }
}

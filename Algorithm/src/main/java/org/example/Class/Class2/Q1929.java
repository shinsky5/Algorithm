package org.example.Class.Class2;

import java.io.*;
import java.util.StringTokenizer;

public class Q1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int cnt = 0;
        for (int i = n; i <= m; i++) {
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }
            if (cnt == 2) {
                bw.write(i+"\n");
            }
            cnt=0;
        }
        bw.flush();
    }
}

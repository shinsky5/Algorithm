package org.example.Lv.Lv14;

import java.io.*;
import java.util.StringTokenizer;

public class Q10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] srr = br.readLine().split(" ");

        int m = Integer.parseInt(br.readLine());
        int cnt = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.countTokens() > 0) {
            String str = st.nextToken();

            for (String s : srr) {
                if (s.equals(str)) {
                    cnt++;
                }
            }
            bw.write(cnt+" ");
            cnt = 0;
        }
        bw.flush();
    }
}

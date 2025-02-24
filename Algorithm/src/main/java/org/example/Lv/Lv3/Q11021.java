package org.example.Lv.Lv3;

import java.io.*;
import java.util.StringTokenizer;

public class Q11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for (int i = 1; i <= a; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            bw.write("Case #"+i+": "+String.valueOf(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
        }

        br.close();

        bw.flush();
        bw.close();
    }
}

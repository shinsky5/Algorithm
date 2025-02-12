package org.example.Lv5;

import java.io.*;

public class Q2743 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int a = str.length();

        bw.write(String.valueOf(a));
        bw.flush();

        br.close();
        bw.close();
    }
}

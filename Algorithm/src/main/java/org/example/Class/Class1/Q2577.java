package org.example.Class.Class1;

import java.io.*;

public class Q2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        String rst = String.valueOf(a*b*c);
        String[] srr = rst.split("");
        int cnt = 0;

        for (int i = 0; i < 10; i++) {
            for (String s : srr) {
                if (s.equals(String.valueOf(i))) {
                    cnt++;
                }
            }
            System.out.println(cnt);
            cnt=0;
        }
    }
}

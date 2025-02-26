package org.example.Lv.Lv14;

import java.io.*;
import java.util.HashSet;

public class Q14425 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] srr = br.readLine().split(" ");
        int n = Integer.parseInt(srr[0]);
        int m = Integer.parseInt(srr[1]);
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }
        int cnt =0;

        for (int i = 0; i < m; i++) {
            if (set.contains(br.readLine())) {
                cnt++;
            }
        }
        bw.write(String.valueOf(cnt));
        bw.flush();
    }
}

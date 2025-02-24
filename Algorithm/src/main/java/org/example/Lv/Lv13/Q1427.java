package org.example.Lv.Lv13;

import java.io.*;
import java.util.Arrays;

public class Q1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String[] srr = str.split("");
        Arrays.sort(srr);


        for (int i = srr.length - 1; i >= 0; i--) {
            bw.write(srr[i]);
        }
        bw.flush();
    }
}

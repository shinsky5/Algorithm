package org.example.Class.Class1;

import java.io.*;

public class Q2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] srr = br.readLine().split(" ");
        int a_cnt = 0;
        int d_cnt = 0;
        for (int i = 0; i < srr.length-1; i++) {
            if (Integer.parseInt(srr[i]) - Integer.parseInt(srr[i + 1])==-1) {
                a_cnt++;
            } else if (Integer.parseInt(srr[i]) - Integer.parseInt(srr[i + 1])==1) {
                d_cnt++;
            }
        }
        if (a_cnt == 7) {
            System.out.println("ascending");
        } else if (d_cnt == 7) {
            System.out.println("descending");
        }else{
            System.out.println("mixed");
        }
    }
}

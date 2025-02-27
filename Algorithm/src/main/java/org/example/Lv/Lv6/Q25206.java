package org.example.Lv.Lv6;

import java.io.*;

public class Q25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double score = 0;
        double avg = 0;
        for (int i = 0; i < 20; i++) {
            String[] srr = br.readLine().split(" ");

            if (srr[2].equals("A+")) {
                srr[2] = "4.5";
            } else if (srr[2].equals("A0")) {
                srr[2] = "4.0";
            }else if (srr[2].equals("B+")) {
                srr[2] = "3.5";
            }else if (srr[2].equals("B0")) {
                srr[2] = "3.0";
            }else if (srr[2].equals("C+")) {
                srr[2] = "2.5";
            }else if (srr[2].equals("C0")) {
                srr[2] = "2.0";
            }else if (srr[2].equals("D+")) {
                srr[2] = "1.5";
            }else if (srr[2].equals("D0")) {
                srr[2] = "1.0";
            } else if (srr[2].equals("F")) {
                srr[2] = "0.0";
            }else{
                continue;
            }

            score += Double.parseDouble(srr[1]);
            avg += Double.parseDouble(srr[1])*Double.parseDouble(srr[2]);
        }
        double rst = 0.0;
        if (score != 0.0) {
            rst = avg/score;
        }
        System.out.printf("%.6f", rst);
    }
}

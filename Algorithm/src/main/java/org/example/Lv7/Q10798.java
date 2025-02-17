package org.example.Lv7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String[][] ans = new String[5][15];

        for (int i = 0; i < ans.length; i++) {
            String str = br.readLine();
            String[] srr = str.split("");
            for (int j = 0; j < srr.length; j++) {
                ans[i][j] = srr[j];
            }
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (ans[j][i]!=null) {
                    System.out.print(ans[j][i]);
                }
            }
        }
    }
}

package org.example.Lv.Lv14;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;

public class Q7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[][] srr = new String[n][2];
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            srr[i] = br.readLine().split(" ");
        }

        for (int i = 0; i < srr.length; i++) {
            for (int j = 0; j < srr[i].length; j++) {
                if (srr[i][j].equals("enter")) {
                    set.add(srr[i][j - 1]);
                } else if (srr[i][j].equals("leave")) {
                    set.remove(srr[i][j - 1]);
                }
            }
        }
        String[] rst = set.toArray(new String[0]);
        Arrays.sort(rst);
        for (int i = rst.length-1; i >=0; i--) {
            bw.write(rst[i]+"\n");
        }
        bw.flush();
    }
}

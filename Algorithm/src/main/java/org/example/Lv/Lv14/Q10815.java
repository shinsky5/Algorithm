package org.example.Lv.Lv14;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Q10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String, String > n_map = new HashMap<>();
        int n = Integer.parseInt(br.readLine());
        String[] n_srr = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            n_map.put(n_srr[i], n_srr[i]);
        }

        int m = Integer.parseInt(br.readLine());
        String[] srr = br.readLine().split(" ");

        for (String s : srr) {
            if (n_map.get(s) != null) {
                bw.write("1 ");
            }else{
                bw.write("0 ");
            }
        }
        bw.flush();
    }
}

package org.example.Lv.Lv14;

import java.io.*;
import java.util.HashMap;

public class Q1620 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] srr = br.readLine().split(" ");
        int n = Integer.parseInt(srr[0]);
        int m = Integer.parseInt(srr[1]);

        HashMap<String, String> map = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            map.put(String.valueOf(i), br.readLine());
        }

            for (int i = 0; i < m; i++) {
                String str = br.readLine();
                for (String s : map.keySet()) {
                    if (map.get(str) != null) {
                        bw.write(map.get(str)+"\n");
                        break;
                    }else if(map.get(s).equals(str)){
                        bw.write(s+"\n");
                    }
                }
            }
            bw.flush();
    }
}

package org.example.Lv.Lv13;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Q11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] xrr = new int[n];
        int[] yrr = new int[n];
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            String[] srr = str.split(" ");
            xrr[i] = Integer.parseInt(srr[0]);
            yrr[i] = Integer.parseInt(srr[1]);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(xrr[i]+" "+yrr[i]);
            map.put("x"+i,xrr[i]);
            map.put("y"+i,yrr[i]);
        }
        System.out.println(map.keySet());
        for (int i = 0; i < map.size(); i++) {
            System.out.println(map.get("x" + i)+" "+map.get("y" + i));
        }
    }
}

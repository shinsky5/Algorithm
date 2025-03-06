package org.example.Class.Class2;

import java.io.*;
import java.util.*;

public class Q2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        while (list.size() > 1) {
            list.remove(0);
            change(list);
        }
        bw.write(String.valueOf(list.get(0)));
        bw.flush();
    }

    public static void change(List<Integer> list) {
        int tmp = list.get(0);
        list.remove(0);
        list.add(tmp);
    }
}

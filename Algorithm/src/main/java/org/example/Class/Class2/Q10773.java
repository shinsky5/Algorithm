package org.example.Class.Class2;

import java.io.*;
import java.util.ArrayList;

public class Q10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> list = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());
        int rst = 0;

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());

            if (a == 0) {
                list.remove(list.size()-1);
            } else {
                list.add(a);
            }
        }
        for (int j : list) {
            rst+=j;
        }
        bw.write(String.valueOf(rst));
        bw.flush();
    }
}

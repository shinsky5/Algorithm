package org.example.Class.Class2;

import java.io.*;
import java.util.ArrayList;

public class Q11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.print(list.get(k-1));
                list.remove(k-1);
            }else{

            }
        }
    }
}

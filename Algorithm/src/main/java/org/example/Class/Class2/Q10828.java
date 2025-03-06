package org.example.Class.Class2;

import java.io.*;
import java.util.ArrayList;

public class Q10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            if (str.startsWith("push")) {
                list.add(str.substring(5));
            } else if (str.startsWith("top")) {
                if (list.isEmpty()) {
                    System.out.println(-1);
                }else{
                    System.out.println(list.get(list.size()-1));
                }
            } else if (str.startsWith("size")) {
                System.out.println(list.size());
            } else if (str.startsWith("empty")) {
                if (list.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else {
                if (list.isEmpty()) {
                    System.out.println(-1);
                }else{
                    System.out.println(list.get(list.size()-1));
                    list.remove(list.size() - 1);
                }
            }
        }
    }
}

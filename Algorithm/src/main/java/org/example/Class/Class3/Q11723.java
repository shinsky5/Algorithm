package org.example.Class.Class3;

import java.io.*;
import java.util.*;

public class Q11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String str= "";
        HashSet<String> set = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            str = br.readLine();
            String num1 = str.substring(str.length() - 2,str.length()-1);
            String num2 = str.substring(str.length() - 1);
            String num = "";
            if (num1.equals(" ")) {
                num = num2;
            }else{
                num = num1 + num2;
            }

            if (str.startsWith("add")) {
                set.add(num);
            } else if (str.startsWith("remove")) {
                set.remove(num);
            } else if (str.startsWith("check")) {
                if (set.contains(num)) {
                    bw.write(1+"\n");
//                    sb.append(1+"\n");
                }else{
                    bw.write(0+"\n");
//                    sb.append(0+"\n");
                }
            } else if (str.startsWith("toggle")) {
                if (set.contains(num)) {
                    set.remove(num);
                }else{
                    set.add(num);
                }
            } else if (str.startsWith("all")) {
                for (int j = 1; j <= 20; j++) {
                    set.add(String.valueOf(j));
                }
            } else {
                set.clear();
            }

        }
        bw.flush();
    }
}

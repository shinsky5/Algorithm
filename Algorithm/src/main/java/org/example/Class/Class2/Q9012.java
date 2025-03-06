package org.example.Class.Class2;

import java.io.*;

public class Q9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int left = 0;
        int right = 0;

        while (n > 0) {
            String[] srr = br.readLine().split("");

            for (String s : srr) {
                if (s.equals("(")) {
                    left++;
                }else{
                    right++;
                }
        }
            if (left == right) {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

            left=0;
            right=0;
            n--;
        }
    }
}

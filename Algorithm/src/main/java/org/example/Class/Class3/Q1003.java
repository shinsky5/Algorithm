package org.example.Class.Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int a = 0;
        int zero = 0;
        int one = 0;
        for (int i = 0; i < n; i++) {
            a = Integer.parseInt(br.readLine());
            System.out.println(fi(a,zero,one));
            zero = 0;
            one = 0;
        }
    }

    public static String fi(int n,int zero,int one) {
        if (n == 0) {
            zero++;
        } else if (n == 1) {
            one++;
        } else {
             String rst1 = fi(n - 1, zero, one);
            System.out.println(rst1);
            String rst2 =fi(n - 2, zero, one);
            System.out.println(rst2);
             return zero+" "+one;
        }
        return zero+" "+one;
    }
}

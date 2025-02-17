package org.example.Lv6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Q1316 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] srr = new String[n];
        int cnt=0;

        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            srr[i] = str;
        }

        System.out.println("srr : "+Arrays.toString(srr));

        for (int i = 0; i < n; i++) {
            String[] split = srr[i].split("");
            System.out.println("split : "+Arrays.toString(split));
            String[] rst = new String[split.length];
            for (int j = 0; j < split.length; j++) {
                rst[j] = String.valueOf(srr[i].indexOf(split[j]))+String.valueOf(srr[i].lastIndexOf(split[j]));
            }

            System.out.println("rst : "+Arrays.toString(rst));
            String[] distinct = Arrays.stream(rst).distinct().toArray(String[]::new);
            System.out.println("distinct : "+Arrays.toString(distinct));
            System.out.println();

            for (int k = 0; k < distinct.length; k++) {
                if (k < distinct.length - 1) {
                    int k1 = Integer.parseInt(distinct[k].substring(1));
                    int k2 = Integer.parseInt(distinct[k+1].substring(0,1));
                    if(k2-k1!=1){
                      cnt++;
                    }
                }
            }
            int[] arr = new int[n];
        }
        System.out.println(cnt);
    }
}

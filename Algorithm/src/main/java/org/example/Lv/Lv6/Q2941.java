package org.example.Lv.Lv6;

import java.util.Arrays;
import java.util.Scanner;

public class Q2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        String[] srr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};


        for (String s : srr) {
            if (str.contains(s)) {
                str = str.replace(s, "*");
                System.out.println(str);
            }
        }
        System.out.println(str.length());
    }
}

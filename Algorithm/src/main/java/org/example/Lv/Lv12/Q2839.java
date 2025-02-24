package org.example.Lv.Lv12;

import java.util.Scanner;

public class Q2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int f_rst = n/5;
        int f_d = n%5;
        int t_rst = n/3;
        int t_d = n%3;

        if (f_d % 3 == 0) {
            System.out.println(f_rst + (f_d/3));
        } else if (t_d == 0) {
            System.out.println(t_rst);
        }else{
            System.out.println("-1");
        }


    }
}

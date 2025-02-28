package org.example.Class.Class2;

import java.util.Scanner;

public class Q30802 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] order = sc.nextLine().split(" ");

        double t = sc.nextDouble();
        double p = sc.nextDouble();

        double rst1 = 0;
        for (String s : order) {
            rst1 += Math.ceil(Double.parseDouble(s) / t);
        }

        System.out.println((int)rst1);
        System.out.println(n/(int)p+" "+n%(int)p);
    }
}

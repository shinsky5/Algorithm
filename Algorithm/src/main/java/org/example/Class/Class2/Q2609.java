package org.example.Class.Class2;

import java.util.Scanner;

public class Q2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(euc(a,b));
        System.out.println(a*b/euc(a,b));

    }

    public static int euc(int a, int b) {
        if (b == 0) {
            return a;
        }else{
            return euc(b, a % b);
        }
    }
}

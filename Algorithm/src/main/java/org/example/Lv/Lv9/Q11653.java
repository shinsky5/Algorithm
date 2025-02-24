package org.example.Lv.Lv9;

import java.util.Scanner;

public class Q11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int min = getMin(a);
        int rst =1;
        if (a == 1) {
            System.out.println();
        }else{
            System.out.println(min);
        }
            while (rst <= a) {
                rst *= min;
                int n_int = a / min;
                min = getMin(n_int);
                if (min == 1) {
                    break;
                }
                a = n_int;
                System.out.println(min);
            }
    }

    public static int getMin(int a) {
        int b = Integer.MIN_VALUE;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                if (b == Integer.MIN_VALUE) {
                    b = i;
                }
            }
        }
        if (b < 0) {
            b=a;
        }
        return b;
    }
}

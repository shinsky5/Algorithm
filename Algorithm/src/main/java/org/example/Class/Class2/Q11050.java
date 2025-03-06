package org.example.Class.Class2;

import java.util.Scanner;

public class Q11050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int top = fac(a);
        int bot1 = fac(a - b);
        int bot2 = fac(b);
        int rst = 0;

        if (b == 0||a==b) {
            rst=1;
        }else{
            rst = top/(bot1*bot2);
        }
        System.out.println(rst);
    }

    public static int fac(int a) {
        for (int i = a-1; i >= 1; i--) {
            a *= i;
        }
        return  a;
    }
}

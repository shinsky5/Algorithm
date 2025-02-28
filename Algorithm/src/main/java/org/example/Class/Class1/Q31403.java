package org.example.Class.Class1;

import java.util.Scanner;

public class Q31403 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int ab = Integer.parseInt(a+""+b);

        System.out.println(a + b - c);
        System.out.println(ab-c);
    }
}

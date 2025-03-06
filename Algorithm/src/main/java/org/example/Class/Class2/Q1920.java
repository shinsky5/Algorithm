package org.example.Class.Class2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        sc.nextLine();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < a; i++) {
            set.add(sc.nextInt());
        }

        int b = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < b; i++) {
            int m = sc.nextInt();
            if (set.contains(m)) {
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
    }
}

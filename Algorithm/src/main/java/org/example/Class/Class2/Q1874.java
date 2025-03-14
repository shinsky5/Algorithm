package org.example.Class.Class2;

import java.util.Scanner;
import java.util.Stack;

public class Q1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        Stack<Integer> sta = new Stack<>();

        System.out.println(sta.pop());
        for (int i = 0; i < n; i++) {
            sta.push(sc.nextInt());
            System.out.println(sta.toString());

        }

    }
}

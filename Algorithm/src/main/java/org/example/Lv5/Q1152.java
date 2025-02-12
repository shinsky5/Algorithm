package org.example.Lv5;

import java.util.Arrays;
import java.util.Scanner;

public class Q1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] srr = sc.nextLine().split(" ");

        int cnt = 0;
        for (String i : srr) {
            if (!i.isBlank()) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}

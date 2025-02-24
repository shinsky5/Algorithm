package org.example.Lv.Lv8;

import java.util.Scanner;

public class Q2903 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = 1;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            m *= 2;
            ans = (m+1)*(m+1);
        }

        System.out.println(ans);
    }
}

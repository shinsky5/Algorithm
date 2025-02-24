package org.example.Lv.Lv9;

import java.util.Arrays;
import java.util.Scanner;

public class Q2501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;
        int ans = 0;

        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                cnt++;
            }
            if (cnt == b) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}

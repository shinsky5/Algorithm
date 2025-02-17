package org.example.Lv7;

import java.util.Scanner;

public class Q2563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[][] bg = new int[100][100];

        for (int i = 0; i < a; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    bg[x+j][y+k]=1;
                }
            }
        }
        int ans = 0;
        for (int[] i : bg) {
            for (int j : i) {
                ans += j;
            }
        }
        System.out.println(ans);
    }
}

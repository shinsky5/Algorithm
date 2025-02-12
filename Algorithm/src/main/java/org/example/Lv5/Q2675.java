package org.example.Lv5;

import java.util.Scanner;

public class Q2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int R = sc.nextInt();
            String str = sc.next();

            for (int k = 0; k < str.length(); k++) {
                for (int j = 0; j < R; j++){
                    System.out.print(str.charAt(k));
                }
            }
            System.out.println();
        }
    }
}

package org.example.Lv6;

import java.io.IOException;
import java.util.Scanner;

public class Q3003 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[6];
        int[] ans = {1, 1, 2, 2, 2, 8};
        int[] rst = new int[6];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < arr.length; i++) {
            rst[i] = ans[i] - arr[i];
        }
        for (int i : rst) {
            System.out.print(i + " ");
        }
    }
}

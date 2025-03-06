package org.example.Class.Class2;


import java.util.Arrays;
import java.util.Scanner;

public class Q7568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] srr = new int[n][2];

        for (int i = 0; i < n; i++) {
            srr[i] = new int[]{sc.nextInt(), sc.nextInt()};
        }

        for (int[] i : srr) {
            for (int j : i) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        Arrays.sort(srr[1]);

    }
}

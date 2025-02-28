package org.example.Class.Class2;

import java.util.Scanner;

public class Q2775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < a; i++) {
            int floor = sc.nextInt();
            int room = sc.nextInt();

            System.out.println(chk(floor-1, room - 1));
        }
    }

    public static int chk(int a, int b) {
        int[] brr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        int[][] arr = new int[14][14];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == 0) {
                    for (int k = 0; k <= j; k++) {
                        arr[i][j] += brr[k];
                    }
                }else{
                    for (int k = 0; k <= j; k++) {
                        arr[i][j] += arr[i-1][k];
                    }
                }
            }
        }

        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        return arr[a][b];
    }
}

package org.example.Lv.Lv12;

import java.util.Arrays;
import java.util.Scanner;

public class Q1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();

        String[][] arr = new String[a][b];
        String[][] brr = new String[2][2];

        for (int i = 0; i < arr.length; i++) {
            String str = sc.nextLine();
            arr[i] = str.split("");
        }




//        for (int i = 0; i < brr.length; i++) {
//            for (int j = 0; j < brr.length; j++) {
//                brr[i][j] = arr[i][j];
//            }
//        }
//
        for (String[] i : brr) {
            for (String j : i) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
//
//        int rst = getCnt(brr);
    }

    public static int getCnt(String[][] arr) {
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j < arr.length - 1) {
                    if (arr[i][j].equals(arr[i][j + 1])) {
                        if (arr[i][j].equals("B")) {
                            arr[i][j + 1] = "W";
                            cnt++;
                        } else {
                            arr[i][j + 1] = "B";
                            cnt++;
                        }
                    }
                }
            }
        }
        return cnt;
    }
}


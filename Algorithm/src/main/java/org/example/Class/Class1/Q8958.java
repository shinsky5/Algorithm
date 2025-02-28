package org.example.Class.Class1;

import java.util.Arrays;
import java.util.Scanner;

public class Q8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < a; i++) {
            String[] srr = sc.nextLine().split("");
            int[] arr = new int[srr.length];

            for (int j = 0; j < srr.length; j++) {
                if (srr[j].equals("O")) {
                    arr[j] = 1;
                    if (j > 0) {
                        if (srr[j].equals(srr[j-1])) {
                            arr[j] =arr[j-1]+1;
                        }
                    }
                }
            }
            System.out.println(Arrays.stream(arr).sum());
        }
    }
}

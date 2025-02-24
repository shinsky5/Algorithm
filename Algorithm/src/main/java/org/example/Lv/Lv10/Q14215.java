package org.example.Lv.Lv10;

import java.util.Arrays;
import java.util.Scanner;

public class Q14215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = {a, b, c};
        Arrays.sort(arr);

        if (arr[2] >= arr[0] + arr[1]) {
            arr[2] = arr[0]+arr[1]-1;
        }

        System.out.println(Arrays.stream(arr).sum());
    }
}

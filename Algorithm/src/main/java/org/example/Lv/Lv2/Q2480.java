package org.example.Lv.Lv2;


import java.util.Arrays;
import java.util.Scanner;

public class Q2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int cnt = 0;
        int[] arr = {a, b, c};

        for (int i : arr) {
            if (a == i) {
                ++cnt;
            }
        }
        Arrays.sort(arr);

        if (cnt == 3) {
            System.out.println(10000 + (arr[0] * 1000));
        } else if (cnt == 2) {
            System.out.println(1000 + (arr[1] * 100));
        } else if(cnt == 1){
            System.out.println(arr[2] * 100);
        }
    }
}

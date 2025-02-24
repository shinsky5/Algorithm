package org.example.Lv.Lv4;

import java.util.Scanner;

public class Q10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        int check = sc.nextInt();
        int[] arr = new int[cnt];

        for (int i = 0; i < cnt; i++) {
            int a = sc.nextInt();
            arr[i] = a;
        }

        for (int i : arr) {
            if(i < check){
                System.out.print(i + " ");
            }
        }
    }
}

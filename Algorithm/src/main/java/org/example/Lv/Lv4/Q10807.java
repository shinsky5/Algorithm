package org.example.Lv.Lv4;

import java.util.Scanner;

public class Q10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        int[] arr = new int[total];

        for (int i = 0; i < total; i++) {
            int a = sc.nextInt();
            arr[i] = a;
        }

        int ch_num = sc.nextInt();
        int cnt =0;

        for (int i : arr) {
            if(i==ch_num){
                cnt ++;
            }
        }
        System.out.println(cnt);
    }
}

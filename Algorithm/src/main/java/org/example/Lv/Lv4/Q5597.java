package org.example.Lv.Lv4;

import java.util.Arrays;
import java.util.Scanner;

public class Q5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[30];
        int n = 0;
        while (n < 30){
            arr[n] = n+1;
            n++;
        }

        for (int i = 0; i < 28; i++) {
            int num = sc.nextInt();
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] == num){
                    arr[j]=0;
                }else{
                    continue;
                }
            }
        }
        Arrays.sort(arr);

        System.out.println(arr[28]);
        System.out.println(arr[29]);
    }
}

package org.example.Lv4;

import java.util.*;

public class Q2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];
        int max = 0;
        int index =0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if(arr[i]>max){
                max = arr[i];
                index = i+1;
            }
        }
        Arrays.sort(arr);

        System.out.println(max);
        System.out.println(index);
    }
}

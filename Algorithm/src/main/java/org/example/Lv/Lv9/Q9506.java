package org.example.Lv.Lv9;

import java.util.Arrays;
import java.util.Scanner;

public class Q9506 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            int rst = 0;
            if (a == -1) {
                break;
            }

            int[] arr = new int[a];

            for (int i = 1; i < a; i++) {
                if(a%i==0){
                    rst += i;
                    arr[i - 1] = i;
                }
            }

            int[] brr = Arrays.stream(arr).distinct().toArray();
            Arrays.sort(brr);

            if (rst == a) {
                System.out.print(a+" = ");
                for (int i = 1; i < brr.length; i++) {
                    if (i != brr.length - 1) {
                        System.out.print(brr[i]+" + ");
                    }else{
                        System.out.print(brr[i]);
                    }
                }
                System.out.println();
            }else{
                System.out.println(a+" is NOT perfect.");
            }
        }
    }
}

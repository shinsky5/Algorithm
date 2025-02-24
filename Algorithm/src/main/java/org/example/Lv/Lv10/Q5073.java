package org.example.Lv.Lv10;

import java.util.Arrays;
import java.util.Scanner;

public class Q5073 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a==0&&b==0&&c==0) break;
            int[] arr = {a, b, c};
            Arrays.sort(arr);
            if (arr[0] + arr[1] > arr[2]) {
                if (a == b && b == c) {
                    System.out.println("Equilateral");
                } else if (a == b || b == c || a == c) {
                    System.out.println("Isosceles");
                }else{
                    System.out.println("Scalene");
                }
            }else{
                System.out.println("Invalid");
            }
        }
    }
}

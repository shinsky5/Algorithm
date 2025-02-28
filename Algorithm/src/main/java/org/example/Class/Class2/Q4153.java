package org.example.Class.Class2;

import java.util.Arrays;
import java.util.Scanner;

public class Q4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a == 0 && b == 0 && c == 0) {
                break;
            }
            double aa = Math.pow(a, 2);
            double bb = Math.pow(b, 2);
            double cc = Math.pow(c, 2);
            double[] arr = {aa, bb, cc};
            Arrays.sort(arr);

            if (arr[0] + arr[1] == arr[2]) {
                System.out.println("right");
            }else{
                System.out.println("wrong");
            }
        }
    }
}

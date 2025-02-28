package org.example.Class.Class2;


import java.util.Arrays;
import java.util.Scanner;

public class Q1259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.nextLine();
            if (str.equals("0")||str.charAt(0)=='0') {
                break;
            }
            String[] arr = str.split("");
            int cnt =0;
            for (int i = 0; i < arr.length; i++) {
               int idx = arr.length-i-1;
                if (arr[i].equals(arr[idx])) {
                    cnt++;
                }
            }
            if (arr.length == cnt) {
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
        }
    }
}

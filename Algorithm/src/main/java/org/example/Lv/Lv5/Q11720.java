package org.example.Lv.Lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Q11720 {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//
//        int a = sc.nextInt();
//        sc.nextLine();
//
//        String str = sc.nextLine();
//
//        String rst = str.substring(0, a);
//
//        int b = 0;
//
//        for (int i = 0; i < a; i++) {
//             b += rst.charAt(i)-48;
//        }
//        System.out.println(b);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String rst = str.substring(0, a);

        int b = 0;
        for (int i = 0; i < a; i++) {
            b+=rst.charAt(i)-48;
        }

        System.out.println(b);

    }
}

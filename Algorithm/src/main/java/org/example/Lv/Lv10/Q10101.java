package org.example.Lv.Lv10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10101 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        br.close();

        int sum = a+b+c;

            if (sum == 180) {
                if (a == b && b == c) {
                    System.out.println("Equilateral");
                } else if (a == b || b == c||a==c) {
                    System.out.println("Isosceles");
                } else {
                    System.out.println("Scalene");
                }
            }else{
                System.out.println("Error");
            }
    }
}

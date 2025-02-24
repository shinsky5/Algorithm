package org.example.Tear.BronzeV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2338 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int a = Integer.parseInt(br.readLine());
//        int b = Integer.parseInt(br.readLine());

        short a = Short.parseShort(br.readLine());
        short b = Short.parseShort(br.readLine());

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
    }
}

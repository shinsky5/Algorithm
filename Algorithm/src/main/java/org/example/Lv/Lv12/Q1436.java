package org.example.Lv.Lv12;

import java.util.HashMap;
import java.util.Scanner;

public class Q1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < 2666800; i++) {
            String s = String.valueOf(i);
            if (s.contains("666")) {
                cnt++;
                map.put(cnt, s);
            }
        }
        int n = sc.nextInt();
        System.out.println(map.get(n));
    }
}
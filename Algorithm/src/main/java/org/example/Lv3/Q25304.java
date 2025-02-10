package org.example.Lv3;

import java.util.Scanner;

public class Q25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int to_cost = sc.nextInt();
        int to_cnt = sc.nextInt();

        int ch_cost = 0;

        for (int i = 0; i < to_cnt; i++) {
            int cost = sc.nextInt();
            int cnt = sc.nextInt();

            ch_cost += (cost * cnt);
        }

        if (to_cost == ch_cost) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}

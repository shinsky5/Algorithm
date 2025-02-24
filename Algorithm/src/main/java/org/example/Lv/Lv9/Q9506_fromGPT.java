package org.example.Lv.Lv9;

import java.util.Scanner;

public class Q9506_fromGPT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == -1) break; // 입력이 -1이면 종료

            int sum = 0;
            StringBuilder sb = new StringBuilder();
            sb.append(n).append(" = ");

            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                    sb.append(i).append(" + ");
                }
            }

            if (sum == n) {
                sb.setLength(sb.length() - 3); // 마지막 " + " 제거
                System.out.println(sb);
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }

        sc.close();
    }
}

package org.example.Lv.Lv9;

import java.util.Scanner;

public class Q2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        int min = Integer.MAX_VALUE;
        StringBuilder sb = new StringBuilder();

        for (int i = m; i <= n; i++) {
            if (isPrime(i)) {  // 소수 판별
                sum += i;
                if (min == Integer.MAX_VALUE) {
                    min = i;  // 첫 번째 소수를 최소값으로 설정
                }
                sb.append(i).append(",");
            }
        }

        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }

        sc.close();
    }

    // 소수 판별 함수 (제곱근까지만 검사하여 최적화)
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

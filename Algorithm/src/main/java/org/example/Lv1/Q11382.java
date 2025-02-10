package org.example.Lv1;

import java.util.Scanner;

public class Q11382 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        A, B, C (1 ≤ A, B, C ≤ 1012) 라는 조건 절에서 int보다 범위가 큰 long을 사용해야함
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        System.out.println(a+b+c);
    }
}

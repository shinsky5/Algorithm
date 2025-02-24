package org.example.Lv.Lv2;

import java.util.Scanner;

public class Q2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        int c = sc.nextInt();


        if (b + c < 60) {
            System.out.print(a + " ");
            System.out.print(b + c);
        } else {
            if (a + ((b + c) / 60) == 24) {
                System.out.print("0 ");
                if (b + (c % 60) == 60) {
                    System.out.print("0");
                } else if (b + (c % 60) > 60) {
                    System.out.print(b + (c % 60) - 60);
                } else {
                    System.out.print(b + (c % 60));
                }
            } else if (a + ((b + c) / 60) > 23) {
                System.out.print(a + ((b + c) / 60) - 24 + " ");
                if (b + (c % 60) == 60) {
                    System.out.print("0");
                } else if (b + (c % 60) > 60) {
                    System.out.print(b + (c % 60) - 60);
                } else {
                    System.out.print(b + (c % 60));
                }
            } else {
                System.out.print(a + ((b + c) / 60) + " ");
                if (b + (c % 60) == 60) {
                    System.out.print("0");
                } else if (b + (c % 60) > 60) {
                    System.out.print(b + (c % 60) - 60);
                } else {
                    System.out.print(b + (c % 60));
                }
            }

        }
    }
}


// Right Answer
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int hour = sc.nextInt(); // 현재 시각의 시
//        int minute = sc.nextInt(); // 현재 시각의 분
//        int cookingTime = sc.nextInt(); // 요리 시간(분 단위)
//
//        int totalMinutes = hour * 60 + minute + cookingTime; // 전체 시간을 분으로 환산
//        int newHour = (totalMinutes / 60) % 24; // 24시간을 기준으로 시간 계산
//        int newMinute = totalMinutes % 60; // 나머지를 분으로
//
//        System.out.println(newHour + " " + newMinute);
//
//        sc.close();
//    }
//}

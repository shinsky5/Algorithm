package org.example.Class.Class1;

import java.util.Scanner;

public class Q10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String[] srr = sc.nextLine().split(" ");
            int a = Integer.parseInt(srr[0]);
            int b = Integer.parseInt(srr[2]);

            int floor = 0;
            int room = 0;
            if (b % a == 0) {
                floor = a;
                room = b/a;
            }else{
                floor = b%a;
                room = b/a +1;
            }

            if (room < 10) {
                System.out.println(floor+"0"+room);
            }else{
                System.out.println(floor+""+room);
            }
        }
    }
}

package org.example.Class.Class2;


import java.util.ArrayList;
import java.util.Scanner;

public class Q11866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> rst = new ArrayList<>();

        for (int i = 1; i < n; i++) {
            list.add(i);
        }
        while (true) {
            int a = list.get(m);
            rst.add(a);
            System.out.println(a);

            m+=3;
            if (m > list.size() - 1) {
                m -= list.size();
            }
        }
    }
}

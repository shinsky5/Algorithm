package org.example.Class.Class2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Q11651 {
    static class Dot {
        int x;
        int y;

        public Dot(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        List<Dot> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(new Dot(sc.nextInt(), sc.nextInt()));
        }

        list.sort(Comparator.comparingInt((Dot d)->d.y).thenComparingInt((Dot d)->d.x));

        for (Dot d : list) {
            System.out.println(d.x + " " + d.y);
        }
    }
}

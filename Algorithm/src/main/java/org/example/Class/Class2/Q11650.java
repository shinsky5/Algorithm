package org.example.Class.Class2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Dot {
    int x;
    int y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }
}


public class Q11650 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        List<Dot> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(new Dot(sc.nextInt(), sc.nextInt()));
        }

        list.sort(Comparator.comparingInt((Dot dot)->dot.x).thenComparingInt((Dot dot)->dot.y));

        for (Dot d : list) {
            System.out.println(d.x+" "+d.y);
        }
    }
}

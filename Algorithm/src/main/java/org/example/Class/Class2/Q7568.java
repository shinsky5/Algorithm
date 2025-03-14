package org.example.Class.Class2;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

class Body{
    int h;
    int w;

    public Body(int w, int h) {
        this.w = w;
        this.h = h;
    }
}

public class Q7568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Body> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());

            list.add(new Body(w, h));
        }

        for (Body b : list) {
            System.out.println(b.w+" "+b.h);
        }

        list.sort((a, b) -> a.h == b.h ? Integer.compare(b.w, a.w) : Integer.compare(b.h, a.h));
        System.out.println();
        for (Body b : list) {
            System.out.println(b.w+" "+b.h);
        }


    }
}

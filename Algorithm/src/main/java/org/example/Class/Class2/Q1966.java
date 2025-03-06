package org.example.Class.Class2;

import java.awt.image.ImageProducer;
import java.util.*;

public class Q1966 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int a = 0;
        int b= 0;
        LinkedList<HashMap<Integer, Integer>> list = new LinkedList<>();
        while (n > 0) {
            a = sc.nextInt();
            b = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < a; i++) {
                HashMap<Integer, Integer> map = new HashMap<>();
                map.put(i,sc.nextInt());
                list.add(map);
            }
            int max = 0;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).get(i) > max) {
                    max = list.get(i).get(i);
                }
            }
            HashMap<Integer, Integer> tmp = new HashMap<>();
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).get(i) < max) {
                    tmp = list.poll();
                    list.addLast(tmp);
                }
            }

            System.out.println(list.toString());



            n--;
        }

    }
}

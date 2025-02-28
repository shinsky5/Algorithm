package org.example.Class.Class2;

import java.util.*;

public class Q10814 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        String[] srr = new String[a];
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < a; i++) {
            srr[i] = sc.nextLine();
            map.put(i, srr[i]);
        }

        Arrays.sort(srr);
        System.out.println(Arrays.toString(srr));
        System.out.println(map.toString());


    }
}

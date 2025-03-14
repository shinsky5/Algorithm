package org.example.Lv.Lv13;


import java.util.*;
public class Q1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(sc.nextLine());
        }

        ArrayList<String> list = new ArrayList<>(set);
        list.sort((a,b)-> a.length()==b.length()?a.compareTo(b):Integer.compare(a.length(),b.length()));
        for (String s : list) {
            System.out.println(s);
        }
    }
}

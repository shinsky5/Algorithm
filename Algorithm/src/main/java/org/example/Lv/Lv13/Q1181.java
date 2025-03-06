package org.example.Lv.Lv13;


import java.util.*;

class Info {
    int leng;
    String str;

    public Info(int leng, String str) {
        this.leng = leng;
        this.str = str;
    }
}
public class Q1181 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Info[] srr = new Info[n];

        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            srr[i] = new Info(str.length(), str);
        }


        for (Info i : srr) {
            System.out.println(i.leng+" "+i.str);
        }
    }
}

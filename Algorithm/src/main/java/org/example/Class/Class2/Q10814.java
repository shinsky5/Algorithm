package org.example.Class.Class2;

import java.util.*;

class Member {
    int age;
    String name;
    int order;

    public Member(int age, String name,int order) {
        this.age = age;
        this.name = name;
        this.order = order;
    }
}

public class Q10814 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        sc.nextLine();
        List<Member> list = new ArrayList<>();

        for (int i = 0; i < a; i++) {
            int age = sc.nextInt();
            String name = sc.next();
            list.add(new Member(age, name,i));
        }

        list.sort(Comparator.comparingInt((Member member) -> member.age).thenComparingInt((Member member) -> member.order));

        for (Member m : list) {
            System.out.println(m.age+" "+m.name);
        }
    }
}

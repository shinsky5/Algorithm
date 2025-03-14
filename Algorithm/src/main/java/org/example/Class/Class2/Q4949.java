package org.example.Class.Class2;

import java.util.ArrayList;
import java.util.Scanner;

public class Q4949 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        while (true) {
            String str = sc.nextLine();
            ArrayList<Character> list = new ArrayList<>();
//            if (str.equals(".")) {
//                break;
//            }

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c == 40 || c == 41 || c == 91 || c == 93 || c == 46) {
                    list.add(str.charAt(i));
                }
            }
            System.out.println(list.toString());
//        }
    }
}

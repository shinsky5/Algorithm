package org.example.Class.Class2;

import java.util.Scanner;

public class Q4949 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int l_s = 0;
        int r_s = 0;

        int l_b = 0;
        int r_b = 0;

        int dot = 0;

        while (true) {
            String str = sc.nextLine();
            char[] crr = str.toCharArray();

            if (str.equals(".")) {
                break;
            }

                for (char c : crr) {
                    if (c == '(') {
                        l_s++;
                    } else if (c == ')') {
                        r_s++;
                    } else if (c == '[') {
                        l_b++;
                    } else if (c == ']') {
                        r_b++;
                    } else if (c == '.') {
                        dot++;
                    }
                }

                if (l_s == r_s && l_b == r_b && dot == 1) {
                    System.out.println(l_s);
                    System.out.println(r_s);
                    System.out.println(l_b);
                    System.out.println(r_b);
                    System.out.println(dot);
                    System.out.println("yes");
                } else {
                    System.out.println(l_s);
                    System.out.println(r_s);
                    System.out.println(l_b);
                    System.out.println(r_b);
                    System.out.println(dot);
                    System.out.println("no");
                }

            l_s = 0;
            r_s = 0;
            l_b = 0;
            r_b = 0;
            dot = 0;

}


    }
}

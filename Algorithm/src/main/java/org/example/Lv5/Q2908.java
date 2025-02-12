package org.example.Lv5;

import java.util.Scanner;

public class Q2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        // StringBuilder를 사용하면 reverse라는 좋은 함수를 사용할 수 있다.
        String a_a = new StringBuilder().append(a).reverse().toString();
        String b_b = new StringBuilder().append(b).reverse().toString();

        String aa = a.charAt(2)+""+ a.charAt(1) +""+ a.charAt(0);
        String bb = b.charAt(2)+""+ b.charAt(1) +""+ b.charAt(0);

        int aaa = Integer.parseInt(aa);
        int bbb = Integer.parseInt(bb);

        if (aaa > bbb) {
            System.out.println(aaa);
        }else{
            System.out.println(bbb);
        }
    }
}

package org.example.Class.Class2;

import java.util.Scanner;

public class Q28702 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();

        int aint = (int) a.charAt(0);
        int bint = (int) b.charAt(0);
        int cint = (int) c.charAt(0);

        int rst = 0;
        if (aint >= 49 && aint <= 57) {
            rst = Integer.parseInt(a)+3;
        }
        if (bint >= 49 && bint <= 57) {
            rst = Integer.parseInt(b)+2;
        }
        if(cint >= 49 && cint <= 57){
            rst = Integer.parseInt(c)+1;
        }

        if (rst % 3 == 0 && rst % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (rst % 3 == 0) {
            System.out.println("Fizz");
        } else if (rst % 5 == 0) {
            System.out.println("Buzz");
        }else{
            System.out.println(rst);
        }
    }
}

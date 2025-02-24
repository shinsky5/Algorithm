package org.example.Lv.Lv2;

import java.util.Scanner;

public class Q2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(b>=45){
            System.out.print(a+" ");
            System.out.print(b-45);
        }else{
            if(a>0){
                System.out.print(a-1+" ");
                System.out.print(60-(45-b));
            }else if(a==0){
                System.out.print("23 ");
                System.out.print(60-(45-b));
            }
        }

    }
}

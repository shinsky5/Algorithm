package org.example.Lv3;

import java.util.Scanner;

public class Q2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char[] arr = new char[a];

        for(int i = 0; i < a; i++){
            for(int j=0;j<a;j++){
                if(j >= a-1-i){
                    arr[j]='*';
                }else{
                    arr[j]=' ';
                }
                System.out.print(arr[j]);
            }
            System.out.println();
        }
    }
}

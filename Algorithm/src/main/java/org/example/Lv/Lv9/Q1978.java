package org.example.Lv.Lv9;

import java.util.Scanner;

public class Q1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;
        int rst = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();

            if (a != 1) {
                for (int j = 2; j < a; j++) {
                    if(a%j==0){
                        cnt++;
                    }
                }

                if (cnt == 0) {
                    rst++;
                }
            }

            cnt=0;
        }
        System.out.println(rst);
    }
}

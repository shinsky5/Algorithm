package org.example.Lv.Lv3;

import java.util.Scanner;

public class Q11022 {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        for (int i = 1; i <= T; i++) {
            int A = in.nextInt();
            int B = in.nextInt();

            System.out.println("Case #" + i + ": " + A + " + " + B + " = " + (A+B));
        }

        in.close();
    }
}

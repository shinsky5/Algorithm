package org.example.Class.Class3;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q1541 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char[] crr = str.toCharArray();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < crr.length; i++) {
            if (crr[i] == 43 || crr[i] == 45) {
                list.add(i);
            }
        }
        for (int i = 0; i < list.size(); i++) {

        }
    }
}

package org.example.Tear.BronzeV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Q1271 {
    public static void main(String[] args)  throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] srr = str.split(" ");

        BigInteger a = new BigInteger(srr[0]);
        BigInteger b = new BigInteger(srr[1]);

        System.out.println(a.divide(b));
        System.out.println(a.remainder(b));

    }
}

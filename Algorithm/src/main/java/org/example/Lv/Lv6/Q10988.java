package org.example.Lv.Lv6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        br.close();

        String rst =new StringBuilder().append(str).reverse().toString();

        if (str.equals(rst)) {
            System.out.println('1');
        }else{
            System.out.println('0');
        }
    }
}

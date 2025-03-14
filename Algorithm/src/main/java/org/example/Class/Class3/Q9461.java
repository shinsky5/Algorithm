package org.example.Class.Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q9461 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        ArrayList<Long> list = new ArrayList<>()
        {
            {
                add(1L);
                add(1L);
                add(1L);
                add(2L);
                add(2L);
            }
        };
        for (int i = 5; i < 100; i++) {
            list.add(list.get(i-1)+list.get(i-5));
        }

        System.out.println(list.toString());
        System.out.println(list.size());

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());
            System.out.println(list.get(a-1));
        }
    }
}

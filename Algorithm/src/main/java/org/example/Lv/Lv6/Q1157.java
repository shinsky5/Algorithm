package org.example.Lv.Lv6;

import java.io.*;
import java.util.*;

public class Q1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] rst = br.readLine().toLowerCase().split("");
        br.close();
        Map<Integer, String> map = new HashMap<>();

        int index =0;
        int cnt =0;
        int max = 0;

        for (String i : rst) {
            for (String j : rst) {
                if(i.equals(j)){
                    cnt++;
                }
            }
            if(cnt>max){
                max=cnt;
            }
            map.put(index++, i.toLowerCase() + String.valueOf(cnt));
            cnt = 0;
        }

        for (int i = 0; i < map.size(); i++) {
            for (int j = 0; j < map.size(); j++) {
                if (i != j) {
                    if (map.get(i).equals(map.get(j))) {
                        map.put(j,"-");
                    }
                }
            }
        }

        int rst_cnt =0;
        String rst_str = "";

        for (int i = 0; i < map.size(); i++) {
                if (map.get(i).substring(1).equals(String.valueOf(max))) {
                    rst_str = map.get(i).substring(0,1).toUpperCase();
                    rst_cnt++;
                }
        }

        if(rst_cnt>1){
            System.out.println("?");
        }else{
            System.out.println(rst_str);
        }
    }
}

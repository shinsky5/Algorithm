package org.example.Lv6;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] rst = str.split("");
        int[] arr = new int[str.length()];

        int cnt=0;
        for (int i = 0; i < rst.length; i++) {
            for (int j = 0; j < rst.length; j++) {
                if((rst[i].toLowerCase()).equals(rst[j].toLowerCase())){
                    cnt++;
                }
            }
            arr[i]=cnt;
            System.out.println(i+"번째 글자 "+rst[i]+" 갯수 : "+cnt);
            cnt=0;
        }

        System.out.println(Arrays.toString(arr));

        int max = 0;
        int max_index = 0;


        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
                max_index = i;
            }
        }
        String max_str = String.valueOf(str.charAt(max_index)).toUpperCase();
        System.out.println(max_str);
    }
}

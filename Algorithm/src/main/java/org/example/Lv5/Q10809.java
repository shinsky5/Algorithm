package org.example.Lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        char[] ch = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        for (char c : ch) {
            System.out.print(str.indexOf(c) + " ");
        }

//        int arr[] = new int[26];
//        Arrays.fill(arr, -1); // 전부 다 -1로 초기화
//
//        for(int i=0;i<str.length();i++) {
//            char ch = str.charAt(i); // b .. a.. e.. k .. 순서대로
//
//            if(arr[ch - 'a']==-1) { //-1인 경우에만 수정 (처음 등장하는 위치 조건)
//                arr[ch-'a'] = i;
//            }
//        }
    }
}

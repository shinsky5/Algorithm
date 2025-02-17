package org.example.Lv6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Q1316_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 단어 개수
        int count = 0; // 그룹 단어 개수 저장

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            if (isGroupWord(str)) {
                count++;
            }
        }

        br.close();
        System.out.println(count);
    }

    public static boolean isGroupWord(String str) {
        HashSet<Character> set = new HashSet<>();
        char prev = 0; // 이전 문자 저장

        for (char c : str.toCharArray()) {
            // 연속된 문자가 아니라면 이전에 등장했는지 확인
            if (prev != c) {
                if (set.contains(c)) {
                    return false; // 그룹 단어 아님
                }
                set.add(c); // 새로운 문자 추가
            }
            prev = c; // 현재 문자를 이전 문자로 업데이트
        }
        return true; // 그룹 단어임
    }
}

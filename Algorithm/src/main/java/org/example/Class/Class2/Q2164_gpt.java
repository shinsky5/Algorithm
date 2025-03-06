package org.example.Class.Class2;

import java.io.*;
import java.util.LinkedList;

public class Q2164_gpt {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        // LinkedList 사용
        LinkedList<Integer> queue = new LinkedList<>();

        // 1부터 n까지 카드 삽입
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        // 큐의 크기가 1일 때까지 반복
        while (queue.size() > 1) {
            queue.poll(); // 첫 번째 카드 버림
            queue.offer(queue.poll()); // 두 번째 카드를 뒤로 보냄
        }

        // 마지막 남은 카드 출력
        bw.write(String.valueOf(queue.poll()));
        bw.flush();
    }
}

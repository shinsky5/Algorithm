package org.example.Class.Class2;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1929_gpt {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        boolean[] isPrime = new boolean[N + 1];
        Arrays.fill(isPrime, true); // 처음엔 모두 소수로 가정

        isPrime[0] = isPrime[1] = false; // 0과 1은 소수가 아님

        // 에라토스테네스의 체 실행
        for (int i = 2; i * i <= N; i++) { // i*i가 N을 넘지 않을 때까지만 확인
            if (isPrime[i]) { // i가 소수라면
                for (int j = i * i; j <= N; j += i) { // i의 배수를 모두 제거
                    isPrime[j] = false;
                }
            }
        }

        // M부터 N까지 소수 출력
        for (int i = M; i <= N; i++) {
            if (isPrime[i]) sb.append(i).append("\n");
        }

        System.out.print(sb.toString());
    }
}

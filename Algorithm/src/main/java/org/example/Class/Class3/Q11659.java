package org.example.Class.Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q11659 {
    public static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] prefixSum = new int[n + 1]; // 누적 합 배열

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + Integer.parseInt(st.nextToken());
        }

        System.out.println(Arrays.toString(prefixSum));

        int str = 0;
        int end = 0;
        int rst = 0;

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            str = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());

            rst = prefixSum[end] - prefixSum[str - 1];
            sb.append(rst).append("\n");
            rst = 0;
        }
        System.out.println(sb);
    }
}

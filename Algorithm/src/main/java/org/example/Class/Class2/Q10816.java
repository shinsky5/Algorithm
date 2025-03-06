package org.example.Class.Class2;

import java.io.*;

public class Q10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");

        int m = Integer.parseInt(br.readLine());
        String[] brr = br.readLine().split(" ");

        int cnt = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (brr[i].equals(arr[j])) {
                    cnt++;
                }

            }
            bw.write(cnt+" ");
            cnt=0;
        }
        bw.flush();
    }
}

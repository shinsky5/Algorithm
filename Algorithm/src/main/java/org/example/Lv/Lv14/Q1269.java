package org.example.Lv.Lv14;

import java.io.*;
import java.util.*;

public class Q1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());
        HashSet<String> set = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            set.add(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (long i = n; i < n+m; i++) {
            String str = st.nextToken();
            if (set.contains(str)) {
                set.remove(str);
            }else{
                set.add(str);
            }
        }
        bw.write(String.valueOf(set.size()));
        bw.flush();
    }
}

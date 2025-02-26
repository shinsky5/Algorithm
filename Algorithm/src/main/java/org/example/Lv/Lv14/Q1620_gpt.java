package org.example.Lv.Lv14;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q1620_gpt {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, String> num_name = new HashMap<>();
        HashMap<String, String> name_num = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            num_name.put(String.valueOf(i + 1), str);
            num_name.put(str,String.valueOf(i + 1));
        }

        for (int i = 0; i < m; i++) {
            String str = br.readLine();
            if (Character.isDefined(str.charAt(0))) {
                bw.write(num_name.get(str)+"\n");
            }else{
                bw.write(num_name.get(str)+"\n");
            }
        }
        bw.flush();
    }
}

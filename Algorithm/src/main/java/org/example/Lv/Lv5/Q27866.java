package org.example.Lv.Lv5;

import java.io.*;

public class Q27866 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str =br.readLine();
        int a = Integer.parseInt(br.readLine());

        br.close();

        char ch = str.charAt(a-1);

        bw.write(ch);
        bw.flush();
        bw.close();

    }
}


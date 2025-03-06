package org.example.Class.Class2;

import java.io.*;
import java.util.*;

public class Q2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            if (map.get(arr[i]) > max) {
                max = map.get(arr[i]);
            }
        }

        ArrayList<Integer> min = new ArrayList<>();
        for (int i : map.keySet()) {
            if (map.get(i) == max) {
                min.add(i);
            }
        }
        Collections.sort(min);
        int avg = Math.round((float) Arrays.stream(arr).sum() / n) ;
        int mid = arr[arr.length / 2];
        int lot = 0;
        if (min.size() < 2) {
            lot = min.get(0);
        }else{
            lot = min.get(1);
        }
        int mm = arr[arr.length - 1] - arr[0];

        bw.write(avg+"\n"+mid+"\n"+lot+"\n"+mm);

        bw.flush();
    }
}

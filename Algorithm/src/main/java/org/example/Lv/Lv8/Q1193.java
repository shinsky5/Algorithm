package org.example.Lv.Lv8;

public class Q1193 {
    public static void main(String[] args) {
        String[][] arr = new String[50][50];
        int[] brr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (i+1)+"/"+(j+1);
            }
        }


        for (String[] i : arr) {
            for (String j : i) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}

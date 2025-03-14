package org.example.Class.Class2;

import java.util.*;
class Print {
    int num;
    int idx;

    public Print(int idx, int num) {
        this.idx = idx;
        this.num = num;
    }
}
public class Q1966 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int all = sc.nextInt();
        for (int i = 0; i < all; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            sc.nextLine();
            LinkedList<Print> list = new LinkedList<>();

            int max = 0;
            for (int j = 0; j < n; j++) {
                list.add(new Print(j,sc.nextInt()));
            }
            Print rst;
            int rst_cnt = 0;
            do {
                rst = order(list);
                rst_cnt++;
            } while (rst.idx != m);
            System.out.println(rst_cnt);
        }
    }

    public static Print order(LinkedList<Print> list) {
            int max = 0;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).num > max) {
                    max = list.get(i).num;
                }
            }
            Print tmp;
            Print rst;
            while (true) {
                if (list.get(0).num < max) {
                    tmp = list.poll();
                    list.addLast(tmp);
                } else if (list.get(0).num == max) {
                    rst = list.poll();
                    break;
                }
            }
            return rst;
        }
    }
package org.example.Class.Class2;

import java.util.*;

public class Q4949_2 {
    static class Loc {
        int idx;
        Character ch;

        public Loc(int idx, Character ch) {
            this.idx = idx;
            this.ch = ch;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.nextLine();
            char[] crr = str.toCharArray();
            ArrayList<Loc> list = new ArrayList<>();

            if (str.equals(".")) {
                break;
            }
            int idx =0;
            for (int i = 0; i < crr.length; i++) {
                if (crr[i] == '(') {
                    list.add(new Loc(idx++, '('));
                } else if (crr[i] == ')') {
                    list.add(new Loc(idx++, ')'));
                } else if (crr[i] == '[') {
                    list.add(new Loc(idx++, '['));
                } else if (crr[i] == ']') {
                    list.add(new Loc(idx++, ']'));
                } else if (crr[i] == '.') {
                    list.add(new Loc(idx++, '.'));
                }
            }

            for (int i = 0; i < list.size(); i++) {
                Loc l = list.get(i);

            }

            idx=0;
        }
    }
}

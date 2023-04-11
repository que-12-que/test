package baidu;
/**
 * 输入一个正整数x,输出一个仅由'r','e','d'三种字符组成的字符串，其中回文子串的数量恰好为x。
 */

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = 10 * 10 * 10 * 10 * 10;
        String s = new String();
        StringBuilder sb = new StringBuilder();
        if (x < a) {
            for (int i = 0; i < x; i++) {
                if (i % 3 == 0) {
                    s += "r";
                } else if (i % 3 == 1) {
                    s += "e";
                } else {
                    s += "d";
                }
            }
            System.out.println(s);
        } else {
            int t = x - a + 1; // 表示大了多少，每大一个就将red用dd、rr、ee交换
            for (int j = 0; j < t; j++) {
                if (j % 3 == 0) {
                    sb.append("rr");
                } else if (j % 3 == 1) {
                    sb.append("ee");
                } else {
                    sb.append("dd");
                }
            }
            int k = t;
            for (int i = 0; i < x-t; i++) {
                if (k % 3 == 0) {
                    sb.append('r');
                    k++;

                } else if (k % 3 == 1) {
                    sb.append('e');
                    k++;
                } else {
                    sb.append('d');
                    k++;
                }
            }
            System.out.println(sb.toString());

        }

    }
}

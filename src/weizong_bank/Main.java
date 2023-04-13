package weizong_bank;
/**
 * 给出四个非负整数L,R,X,Y，请计算有多少个非负整数N满足以下四个条件：
 * 1. N的二进制表示中1的个数不小于L
 * 2. N的二进制表示中1的个数不大于R
 * 3. N和X的按位与为X
 * 4. N和Y的按位或为Y
 * 、
 * 输入：
 * 第一行有一个正整数T(1≤T≤1000)，代表有多少组测试数据。接下来是T组测试数据，每组由一行构成。
 * 每一组测试数据仅包含四个整数L,R,X,Y(0≤L≤R≤30,0≤X,Y≤230-1)
 * 输出：一个整数
 */
//AC 81%
import java.util.*;
public class Main {
    public static void main (String[] args) {
//        System.out.println(count_one(8));
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int i = 0; i < T; i++) {
            int L = scan.nextInt();
            int R = scan.nextInt();
            int X = scan.nextInt();
            int Y = scan.nextInt();
            int count = 0;
            for (int j = 0; j < Math.max(X, Y); j++) {
                if (((j & X) == X) && ((j | Y) == Y)) { // 判断后两个条件是否成立
                    int t = j;
                    if (count_one(t) >= L && count_one(t) <= R) {
//                        System.out.println(j);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
    public static int count_one (int n) {
        int count = 0;
        while (n > 0) {
//            System.out.println("n:"+n);
            if ((n&1) == 1) {
                count++;
            }
            n >>=1;
        }
        return count;
    }
}

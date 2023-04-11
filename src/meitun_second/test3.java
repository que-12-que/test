package meitun_second; /**
 * 小美明天要去春游了。她非常喜欢吃巧克力，希望能够带尽可能多的巧克力在春游的路上吃。
 * 她现在有n个巧克力，很巧的是她所有的巧克力都是厚度一样的正方形的巧克力板，
 * 这n个巧克力板的边长分别为a1,a2,...,an。因为都是厚度一致的正方形巧克力板，
 * 我们认为第 i 个巧克力的重量为。小美现在准备挑选一个合适大小的包来装尽可能多的巧克力板，
 * 她十分需要你的帮助来在明天之前准备完成，请你帮帮她。
 *
 * 第一行两个整数n和m，表示小美的巧克力数量和小美的询问数量。
 * 第二行n个整数a1,a2,...,an，表示n块正方形巧克力板的边长。注意你不能将巧克力板进行拆分。
 * 第三行m个整数q1,q2,...,qm，第 i 个整数qi表示询问：如果小美选择一个能装qi重量的包，最多能装多少块巧克力板？（不考虑体积影响，我们认为只要质量满足要求，巧克力板总能塞进包里）
 * 1≤n,m≤50000,1≤ai≤104,1≤qi≤1018
 *
 * 输出一行m个整数，分别表示每次询问的答案。
 *5 5
 * 1 2 2 4 5
 * 1 3 7 9 15
 *
 *1 1 2 3 3
 * */

import java.util.Arrays;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        // 巧克力边长
        int a[] = new int[n];
        // 求刚好全部装下的背包大小
        for (int i =0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        Arrays.sort(a);
        // 背包大小
        int q[] = new int[m];
        for (int i = 0; i < m; i++) {
            q[i] = scan.nextInt();
        }

        for (int i = 0; i < m; i++) {
            int[][] dp = new int[n+1][q[i]+1];
            for (int j = 0; j <= n; j++) {
                for (int k = 0; k <= q[i]; k++) {
                    if (j == 0 || k == 0) dp[j][k] = 0;
//                    if (dp[j-1][k])
                }
            }
        }
    }
}

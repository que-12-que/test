package xiecheng;

import java.util.Scanner;

/**
 * 游游拿到一棵树，树的每条边有权值，选择一些边染成红色，
 * 且染色的边不能共用一个点，权值之和尽可能大。
 *
 * 输入：一个正整数n，表示节点的数量
 * 接下来n-1行，每行三个整数u,v,w，代表点和权值w
 * 输出：一个正整数，表示最大权值
 */
//5
//1 2 2
//2 3 5
//3 4 4
//3 5 3
public class test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] net = new int[n][n];
        for (int i = 0; i < n-1; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            net[u-1][v-1] = w;
            net[v-1][u-1] = w;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(net[i][j] + " ");
            }
            System.out.println("");
        }

    }
}

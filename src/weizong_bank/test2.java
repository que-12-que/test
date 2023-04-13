package weizong_bank;
/**
 * 禁忌魔法书中有一道威力强大的禁咒，名为大湮灭术。该禁咒所到之处寸草不生，万物归0。
 * 世间充斥着正负两种能量，正能量对人体有益，而负能量对人体是有害的。已知地图上有n个排成一列的地域，
 * 每个地域的能量都不一样，可以用一个数字来代表某个地域中正负能量的总数，正数代表正能量比负能量多，反之亦然。
 * 现在大湮灭术的卷轴只剩下了两个，你可以对任何一个连续的区域使用大湮灭术，使用之后，无论该连续区域中能量有多少，
 * 都会清0。你希望天地间的正能量最多，请问能使得正能量最多为多少。
 * （如果天地间都是正能量，不使用卷轴也是可以的）
 *
 * 输入第一行仅包含一个正整数n(1<=n<=100000)，表示地域数量。
 * 输入第二行包含n个整数，每个整数代表一个地域的能量总和,保证这个数值的绝对值不大于100000。
 *
 * 输出仅包含一个整数，即正能量最多为多少。
 *
 * 10
 * -32 23 -93 -21 30 9 27 -88 93 61
 *
 * 220
 */

import java.util.Scanner;

public class test2 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }
        int left = 0;
        while (left < n) {
            while (left < n && nums[left] > 0) { // 找到第一个小于0的数
                left++;
            }



        }


    }
}

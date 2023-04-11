package xiecheng;
/**
 * 定义：
 * 排列：由1到n所有正整数组成的长度为n的数组,每个数出现一次
 * 好元素：在一个排列中，对于第i个元素ai而言，ai为前i个元素的最大值。
 * 游游希望构造一个长度为n的排列，其中有k个好元素，且任意的好元素不相邻。
 *输入：两个正整数n,k
 * 输出：一行n个正整数
 */

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        if (n == 1) {
            System.out.println(1);
        } else if (k == n/2 + 1){ // 首先递减排序，然后选出前k个数，然后从数组末尾插入k-1个数
            int[] nums = new int[n];
            int t = n;
            for (int i = 0; i < n; i++) {
                nums[i] = t--;
            }
            int[] pre = new int[k];
            int[] last = new int[k-1];
            for (int i = 0; i < k; i++) {
                pre[i] = nums[i];
            }
            for (int i = 0; i < k-1; i++) {
                last[i] = nums[n-1-i];
            }

            int[] res = new int[n];
            for (int i = 0, j = k-1; i < 2*k-1; i += 2, j--) {
                res[i] = pre[j];
            }
            for (int i = 1, j = 0; i < 2*k-1; i += 2, j++) {
                res[i] = last[j];
            }

            for (int i = 0; i < n; i++) {
                System.out.println(res[i]);
            }
        }else {
            // 首先递减排序，然后选出前k个数，然后从数组末尾插入k个数
            int[] nums = new int[n];
            int t = n;
            for (int i = 0; i < n; i++) {
                nums[i] = t--;
            }
            int[] pre = new int[k];
            int[] last = new int[k];
            for (int i = 0; i < k; i++) {
                pre[i] = nums[i];
                last[i] = nums[n-i-1];
            }

            int[] res = new int[n];
            for (int i = 0, j = k-1; i < 2*k; i += 2, j--) {
                res[i] = pre[j];
            }
            for (int i = 1, j = 0; i < 2*k + 1; i += 2, j++) {
                res[i] = last[j];
            }

            t = k;
            for (int i = 2 * k; i < n; i++) {
                res[i] = nums[t++];
            }
            for (int i = 0; i < n; i++) {
                System.out.println(res[i]);
            }
        }




    }
}


package meitun_second;

import java.util.Scanner;

/**
 * 小美特别爱吃糖果。小美家楼下正好有一个糖果专卖店，每天供应不同种类的糖果。小美预先拿到了糖果专卖店接下来n天的进货计划表，
 * 并针对每天的糖果种类标注好了对小美而言的美味值。小美当然想每天都能去买糖果吃，不过由于零花钱限制（小美零花钱并不多！）以及健康考虑，
 * 小美决定原则上如果今天吃了，那么明天就不能吃。但小美认为凡事都有例外，所以她给了自己k次机会，
 * 在昨天已经吃了糖果的情况下，今天仍然连续吃糖果！简单来说，小美每天只能吃一次糖果，原则上如果昨天吃了糖果那么今天就不能吃，但有最多k次机会打破这一原则。
 * 小美不想浪费每次吃糖果的机会，所以请你帮帮她规划一下她的吃糖果计划，使得她能吃到的糖果美味值最大。
 *
 * 第一行两个整数n和k，表示拿到的进货计划表的天数和最多打破原则的次数。
 * 第二行n个整数a1,a2,...,an，其中ai表示接下来第 i 天糖果专卖店的糖果的美味值。
 * 1≤n≤2000,1≤k≤1000,1≤ai≤10000
 *
 * 输出一行一个数，表示小美能吃到的糖果美味值之和最大值。
 *
 *7 1
 * 1 2 3 4 5 6 7
 *
 * 19
 */
public class fujia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }
        int dp[] = new int[n];
        dp[0] = nums[0];
        if (n == 1) System.out.println(dp[0]);
        if (k == 0)
            dp[1] = nums[0] > nums[1] ? nums[0] : nums[1];
        dp[1] = nums[0] + nums[1];
        for (int i = 2; i < n; i++) {
            // 假设dp[i-2] + nums[i] > dp[i-1]
            if (dp[i-2] + nums[i] > dp[i-1] && k==0) {
                dp[i] = dp[i-2] + nums[i];
            } else if (dp[i-2] + nums[i] <= dp[i-1] && k==0){
                dp[i] = dp[i-1];
            } else if (k > 0) {
                dp[i] = dp[i-1] + nums[i];
                k--;
            }
        }
        int max = dp[0];
        for (int i = 1; i < n; i++) {
            if (dp[i] > max)
                max = dp[i];
        }
        System.out.println(max);
    }
}

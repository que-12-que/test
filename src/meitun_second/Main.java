package meitun_second; /**
 * 小美因乐于助人的突出表现获得了老师的嘉奖。老师允许小美从一堆n个编号分别为1,2,...,n
 * 的糖果中选择任意多个糖果作为奖励（每种编号的糖果各一个），但为了防止小美一次吃太多糖果有害身体健康，
 * 老师设定了一个限制：如果选择了编号为 i 的糖果，那么就不能选择编号为 i-1, i-2, i+1, i+2的四个糖果了。
 * 在小美看来，每个糖果都有一个对应的美味值，小美想让她选出的糖果的美味值之和最大！作为小美的好朋友，请你帮帮她！
 *
 * 第一行一个整数n，表示糖果数量。
 * 第二行n个整数a1,a2,...,an，其中ai表示编号为 i 的糖果的美味值。
 * 1≤n≤50000 , 1≤ai≤10000
 *
 * 输出一行一个数，表示小美能获得的糖果美味值之和最大值。
 * */
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int nums[] = new int[n];
        for (int i =0; i < n; i++) {
            nums[i] = scan.nextInt();
        }
        Arrays.sort(nums);
        int[] dp = new int[n];
        if (n == 1) {
            dp[0] = nums[0];
            System.out.println(dp[n-1]);
        }
        if (n == 2) {
            int res = nums[0] > nums[1] ? nums[0] : nums[1];
            System.out.println(res);
        }
        if (n == 3) {
            int res = nums[0] > nums[1] ? nums[0] : nums[1];
            res = res > nums[2] ? res : nums[2];
        }
        if (n >= 4) {
            dp[0] = nums[0];
            dp[1] = nums[0] > nums[1] ? nums[0] : nums[1];
            int res = nums[0] > nums[1] ? nums[0] : nums[1];
            dp[2] = res > nums[2] ? res : nums[2];
            for (int i = 3; i < n; i++) {
                if (dp[i-3] + nums[i] > dp[i-1] && dp[i-3] + nums[i] > dp[i-2]){
                    dp[i] = dp[i-3] + nums[i];
                } else {
                    dp[i] = dp[i-1];
                }
            }
        }
        int max = dp[0];
        for (int i = 1; i < n; i++) {
            if (dp[i] > max)
                max = dp[i];
        }
        System.out.println(max);
        // dp[0] = a1;  dp[1] = a2 > a1 ? a2 : a1;  dp[2] = a3 > dp[1] ? a3 : dp[1];
        // dp[i] 表示选取的是以i为结尾的糖果，那么dp[i-3] + nums[i] > dp[i-1]  dp[i-2]

    }
}

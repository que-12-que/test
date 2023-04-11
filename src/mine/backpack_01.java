package mine;

public class backpack_01 {
    private static int[] weights = {20,40,80,10};
    private static int[] values = {100,60,200,40};

    public static void main(String[] args) {
        int volume = 100;
        int nums = weights.length;;
        int[][] dp = new int[nums+1][volume+1];

        for (int i = 1; i <= nums; i++) {
            for (int j = 1; j <= volume; j++) {
                if (j < weights[i-1]) { // 容量不够
                    dp[i][j] = dp[i-1][j];
                    continue;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-weights[i-1]] + values[i-1]);
                }
            }
        }
        System.out.println(dp[nums][volume]);
    }
}

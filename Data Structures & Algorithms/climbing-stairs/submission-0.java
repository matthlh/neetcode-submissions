class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n +3];
        dp[0] = 1;
        int index = 0;

        while (index <= n) {
            dp[index + 1] += dp[index];
            dp[index + 2] += dp[index];

            index++;
        }

        return dp[n];
    }
}

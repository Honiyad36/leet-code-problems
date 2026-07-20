class Solution {
    public int numPermsDISequence(String s) {
        int n = s.length();
        int MOD = 1_000_000_007;
        int[][] dp = new int[n + 1][n + 1];
        dp[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            char move = s.charAt(i - 1);
            if (move == 'I') {
                int runningSum = 0;
                for (int j = 0; j <= i; j++) {
                    if (j > 0) {
                        runningSum = (runningSum + dp[i - 1][j - 1]) % MOD;
                    }
                    dp[i][j] = runningSum;
                }
            } else {
                int runningSum = 0;
                for (int j = i - 1; j >= 0; j--) {
                    runningSum = (runningSum + dp[i - 1][j]) % MOD;
                    dp[i][j] = runningSum;
                }
            }
        }
        int ans = 0;
        for (int j = 0; j <= n; j++) {
            ans = (ans + dp[n][j]) % MOD;
        }
        return ans;
    }
}

package leetproblems;

public class Q518_CoinChange2 {
	public int change(int amount, int[] coins) {
		int n = coins.length;
		int[][] dp = new int[n + 1][amount + 1];
		for (int i = 0; i <= n; ++i) {
			for (int j = 0; j <= amount; ++j) {
				if (i == 0)
					dp[i][j] = 0;
				if (j == 0)
					dp[i][j] = 1;
				if (i != 0 && j != 0) {
					int excluded = dp[i - 1][j];
					if (coins[i - 1] <= j) {
						int included = dp[i][j - coins[i - 1]];
						dp[i][j] = included + excluded;
					} else
						dp[i][j] = excluded;
				}
			}
		}
		return dp[n][amount];
	}
}

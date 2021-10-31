package leetproblems;

import java.util.Arrays;

public class Q322_CoinChange {// if no change possible return -1;
	public int coinChange(int[] coins, int amount) {
		int n = coins.length;
		int[][] dp = new int[n + 1][amount + 1];
		for (int i = 0; i <= n; ++i)
			dp[i][0] = 0;
		for (int j = 0; j <= amount; ++j)
			dp[0][j] = amount + 1;

		for (int i = 1; i <= n; ++i) {
			for (int j = 1; j <= amount; ++j) {
				int excluded = dp[i - 1][j];
				if (j >= coins[i - 1]) {
					int included = 1 + dp[i][j - coins[i - 1]];
					dp[i][j] = Math.min(included, excluded);
				} else {
					if (j == amount)
						dp[i][j] = amount + 1;
					else
						dp[i][j] = excluded;
				}
			}
		}
		for (int i = n; i > 0; --i) {
			if (dp[i][amount] <= amount)
				return dp[i][amount];
		}
		return -1;
	}

	public int coinChange_1(int[] coins, int amount) {
		int n = coins.length;
		int[] dp = new int[amount + 1];
		Arrays.fill(dp, amount + 1);
		dp[0] = 0;
		for (int i = 1; i <= amount; ++i) {
			for (int j = 0; j < n; ++j) {
				if (coins[j] <= i)
					dp[i] = Math.min(1 + dp[i - coins[j]], dp[i]);
			}
		}
		return dp[amount] > amount ? -1 : dp[amount];
	}
}

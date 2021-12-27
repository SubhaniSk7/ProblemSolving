package leetproblems;

public class Q188_BestTimeToBuyAndSellStockIV {// K Transaction
	public int maxProfit(int k, int[] prices) {
		int n = prices.length;
		// K can be atmost n/2 --> if(k > n/2) k = n/2;
		int[][] dp = new int[k + 1][n + 1];
		for (int i = 0; i <= k; ++i) {
			int prevDiff = Integer.MIN_VALUE;
			for (int j = 0; j <= n; ++j) {
				if (i == 0 || j == 0)
					dp[i][j] = 0;
				else {
					prevDiff = Math.max(prevDiff, dp[i - 1][j - 1] - prices[j - 1]);
					dp[i][j] = Math.max(dp[i][j - 1], prices[j - 1] + prevDiff);
				}
			}
		}
		return dp[k][n];
	}
}

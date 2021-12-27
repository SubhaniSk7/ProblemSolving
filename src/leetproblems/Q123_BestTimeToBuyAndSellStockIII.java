package leetproblems;

public class Q123_BestTimeToBuyAndSellStockIII {// K = 2 Transaction
//	public int maxProfit(int[] prices) {// TLE
//		int k = 2, n = prices.length;
//		int[][] dp = new int[k + 1][n + 1];
//		for (int i = 0; i <= k; ++i) {
//			for (int j = 0; j <= n; ++j) {
//				if (i == 0 || j == 0)
//					dp[i][j] = 0;
//				else {
//					int max_so_far = 0;
//					for (int m = 0; m < j; ++m)
//						max_so_far = Math.max(max_so_far, prices[j - 1] - prices[m] + dp[i - 1][m]);
//					dp[i][j] = Math.max(dp[i][j - 1], max_so_far);
//				}
//			}
//		}
//
//		return dp[k][n];
//	}

	public int maxProfit(int[] prices) {
		int k = 2, n = prices.length;
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

	public int maxProfit_1(int[] prices) {// time: O(n) & space: O(1)
		int first_buy = Integer.MIN_VALUE, first_sell = 0, second_buy = Integer.MIN_VALUE, second_sell = 0;
		for (int x : prices) {
			first_buy = Math.max(first_buy, -x);
			first_sell = Math.max(first_sell, first_buy + x);
			second_buy = Math.max(second_buy, first_sell - x);
			second_sell = Math.max(second_sell, second_buy + x);
		}
		return second_sell;
	}
}

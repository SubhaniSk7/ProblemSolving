package leetproblems;

public class Q123_BestTimeToBuyAndSellStockIII {
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

	public static void main(String[] subhani) {
		String str = ".";
		System.out.println(str.equals("."));
		StringBuilder sb = new StringBuilder();
	}

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
}

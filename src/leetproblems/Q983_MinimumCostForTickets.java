package leetproblems;

import java.util.Arrays;

public class Q983_MinimumCostForTickets {
	public int mincostTickets(int[] days, int[] costs) {
		int[] dp = new int[367];
		for (int i = 1; i <= 366; ++i) {
			int index = Arrays.binarySearch(days, i);
			if (index < 0) {
				dp[i] = dp[i - 1];
			} else {
				int c1 = dp[i - 1] + costs[0];
				int c2 = dp[Math.max(0, i - 7)] + costs[1];
				int c3 = dp[Math.max(0, i - 30)] + costs[2];
				dp[i] = Math.min(c1, Math.min(c2, c3));
			}
		}
		return dp[366];
	}
}

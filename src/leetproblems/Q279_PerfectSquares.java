package leetproblems;

import java.util.ArrayList;

public class Q279_PerfectSquares {

	public int numSquares(int n) {// = Min coins to get Target
		ArrayList<Integer> ps = new ArrayList<>();
		for (int i = 1; i * i <= n; ++i)
			ps.add(i * i);
		int s = n, m = ps.size();
		int[][] dp = new int[m + 1][s + 1];
		for (int i = 0; i <= m; ++i)
			dp[i][0] = 0;
		for (int j = 0; j <= s; ++j)
			dp[0][j] = s + 1;

		for (int i = 1; i <= m; ++i) {
			for (int j = 1; j <= s; ++j) {
				int exclude = dp[i - 1][j];
				if (ps.get(i - 1) <= j) {
					int include = 1 + dp[i][j - ps.get(i - 1)];
					dp[i][j] = Math.min(include, exclude);
				} else
					dp[i][j] = exclude;
			}
		}
		return dp[m][s];
	}
}

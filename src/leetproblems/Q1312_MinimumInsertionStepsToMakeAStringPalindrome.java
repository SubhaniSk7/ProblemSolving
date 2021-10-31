package leetproblems;

public class Q1312_MinimumInsertionStepsToMakeAStringPalindrome {
	public int minInsertions(String s) {
		return s.length() - lcs(s);
	}

	public int lcs(String s) {
		int n = s.length();
		String t = new StringBuilder(s).reverse().toString();
		int[][] dp = new int[n + 1][n + 1];
		for (int i = 0; i <= n; ++i) {
			for (int j = 0; j <= n; ++j) {
				if (i == 0 || j == 0)
					dp[i][j] = 0;
				else if (s.charAt(i - 1) == t.charAt(j - 1))
					dp[i][j] = 1 + dp[i - 1][j - 1];
				else
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
			}
		}
		return dp[n][n];
	}
}

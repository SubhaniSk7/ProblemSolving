package leetproblems;

public class Q44_WildcardMatching {
	public boolean isMatch(String s, String p) {
		int m = s.length(), n = p.length();
		boolean[][] dp = new boolean[m + 1][n + 1];
		dp[0][0] = true;
		for (int i = 1; i <= m; ++i)
			dp[i][0] = false;
		for (int j = 1; j <= n; ++j) {
			if (p.charAt(j - 1) == '*')
				dp[0][j] = dp[0][j - 1];
			else
				dp[0][j] = false;
		}
		for (int i = 1; i <= m; ++i) {
			for (int j = 1; j <= n; ++j) {
				char s1 = s.charAt(i - 1), p1 = p.charAt(j - 1);
				if (s1 == p1 || p1 == '?')
					dp[i][j] = dp[i - 1][j - 1];
				else if (p1 == '*') {
					dp[i][j] = dp[i][j - 1] || dp[i - 1][j];
				} else
					dp[i][j] = false;
			}
		}
		return dp[m][n];
	}
}

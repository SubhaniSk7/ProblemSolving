package leetproblems;

public class Q647_PalindromicSubstrings {
	public int countSubstrings(String s) {
		int n = s.length(), result = 0;
		boolean[][] dp = new boolean[n][n];
		for (int i = 0; i < n; ++i) {
			result++;
			dp[i][i] = true;
		}
		for (int len = 2; len <= n; ++len) {
			for (int i = 0; i < n - len + 1; ++i) {
				int j = i + len - 1;
				if (s.charAt(i) == s.charAt(j) && (len == 2 || dp[i + 1][j - 1])) {
					dp[i][j] = true;
					result++;
				}
			}
		}
		return result;
	}

	public int countSubstrings_1(String s) {// extending both sides --> odd, even length
		int n = s.length(), result = 0;
		for (int i = 0; i < n; ++i) {
			int l = i;
			int r = i;
			while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
				result++;
				l--;
				r++;
			}

			l = i;
			r = i + 1;
			while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
				result++;
				l--;
				r++;
			}
		}
		return result;
	}
}

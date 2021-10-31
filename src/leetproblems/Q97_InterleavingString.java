package leetproblems;

public class Q97_InterleavingString {
	public boolean isInterleave(String s1, String s2, String s3) {
		int n = s1.length(), m = s2.length(), t = s3.length();
		if (t != n + m)
			return false;
		boolean[][] dp = new boolean[n + 1][m + 1];
		for (int i = 0; i <= n; ++i) {
			for (int j = 0; j <= m; ++j) {
				if (i == 0 && j == 0)
					dp[i][j] = true;
				else if (i == 0)
					dp[i][j] = (dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1));
				else if (j == 0)
					dp[i][j] = (dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1));
				else
					dp[i][j] = (dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1)) || (dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1));
			}
		}
		return dp[n][m];
	}

//	HashSet<Integer> set = new HashSet<>();
//
//	public boolean isInterleave_1(String s1, String s2, String s3) {
//		int n = s1.length(), m = s2.length(), t = s3.length();
//		if (t != n + m)
//			return false;
//		return rec(s1, s2, 0, 0, s3, 0);
//	}
//
//	public boolean rec(String s1, String s2, int i, int j, String s3, int k) {
//		int hash = i * s3.length() + j;
//		if (set.contains(hash))
//			return false;
//
//		if (i == s1.length())
//			return s2.substring(j).equals(s3.substring(k));
//		if (j == s2.length())
//			return s1.substring(i).equals(s3.substring(k));
//		boolean one = false, two = false;
//		if (i < s1.length() && s1.charAt(i) == s3.charAt(k))
//			one = rec(s1, s2, i + 1, j, s3, k + 1);
//		if (j < s2.length() && s2.charAt(j) == s3.charAt(k))
//			two = rec(s1, s2, i, j + 1, s3, k + 1);
//		set.add(hash);
//		return one || two;
//	}
}

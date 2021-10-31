package leetproblems;

public class Q115_DistinctSubsequences {
//	HashMap<String, Integer> map = new HashMap<>();
//
//	public int numDistinct(String s, String t) {// recursive
//		return dfs(s, t, 0, 0);
//	}
//	public int dfs(String s, String t, int i, int j) {
//		if (j == t.length())
//			return 1;
//		if (i == s.length())
//			return 0;
//		int result = 0;
//		if (map.containsKey(i + " " + j))
//			return map.get(i + " " + j);
//		if (s.charAt(i) == t.charAt(j)) 
//			result = dfs(s, t, i + 1, j + 1) + dfs(s, t, i + 1, j);
//		 else 
//			result = dfs(s, t, i + 1, j);
//		map.put(i + " " + j, result);
//		return result;
//	}

	public int numDistinct(String s, String t) {
		int cols = s.length();// s
		int rows = t.length();// t
		int[][] dp = new int[rows + 1][cols + 1];
		for (int i = 0; i <= rows; ++i)
			dp[i][0] = 0;
		for (int j = 0; j <= cols; ++j)// empty subseq is occurs 1 time
			dp[0][j] = 1;

		for (int i = 1; i <= rows; ++i) {
			for (int j = 1; j <= cols; ++j) {
				if (t.charAt(i - 1) == s.charAt(j - 1))
					dp[i][j] = dp[i - 1][j - 1] + dp[i][j - 1];
				else
					dp[i][j] = dp[i][j - 1];
			}
		}
		return dp[rows][cols];
	}
}

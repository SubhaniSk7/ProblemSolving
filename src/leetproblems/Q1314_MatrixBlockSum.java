package leetproblems;

public class Q1314_MatrixBlockSum {
//	public int[][] matrixBlockSum_1(int[][] mat, int k) {
//		int m = mat.length, n = mat[0].length;
//		int[][] dp = new int[m + 1][n + 1];
//		int[][] answer = new int[m][n];
//		for (int i = 0; i <= m; ++i)
//			dp[i][0] = 0;
//		for (int j = 0; j <= n; ++j)
//			dp[j][j] = 0;
//
//		for (int i = 1; i <= m; ++i) {
//			for (int j = 1; j <= n; ++j)
//				dp[i][j] = dp[i][j - 1] + mat[i - 1][j - 1];
//		}
//		for (int i = 0; i < m; ++i) {
//			for (int j = 0; j < n; ++j) {
//				int total = 0;
//				for (int w = Math.max(0, i + 1 - k); w <= Math.min(m, i + k + 1); ++w) {
//					int c1 = Math.min(n, j + 1 + k);
//					int c2 = Math.max(0, j - k);
//					total += dp[w][c1] - dp[w][c2];
//				}
//				answer[i][j] = total;
//			}
//		}
//		return answer;
//	}

	public int[][] matrixBlockSum(int[][] mat, int k) {
		int m = mat.length, n = mat[0].length;
		int[][] dp = new int[m + 1][n + 1];
		int[][] answer = new int[m][n];

		for (int i = 1; i <= m; ++i) {
			for (int j = 1; j <= n; ++j)
				dp[i][j] = mat[i - 1][j - 1] + dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1];
		}
		for (int r = 0; r < m; ++r) {
			for (int c = 0; c < n; ++c) {
				int r1 = Math.max(0, r - k), c1 = Math.max(0, c - k);
				int r2 = Math.min(m - 1, r + k), c2 = Math.min(n - 1, c + k);
				r1++;// in dp matrix
				c1++;
				r2++;
				c2++;
				answer[r][c] = dp[r2][c2] - dp[r2][c1 - 1] - dp[r1 - 1][c2] + dp[r1 - 1][c1 - 1];
			}
		}
		return answer;
	}
}

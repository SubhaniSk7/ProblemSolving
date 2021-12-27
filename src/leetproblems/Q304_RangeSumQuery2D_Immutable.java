package leetproblems;

public class Q304_RangeSumQuery2D_Immutable {
	int[][] dp;

	public Q304_RangeSumQuery2D_Immutable(int[][] matrix) {

		int m = matrix.length, n = matrix[0].length;
		dp = new int[m + 1][n + 1];
		for (int i = 0; i <= m; ++i)
			dp[i][0] = 0;
		for (int j = 0; j <= n; ++j)
			dp[0][j] = 0;

		for (int i = 1; i <= m; ++i)
			for (int j = 1; j <= n; ++j)
				dp[i][j] = matrix[i - 1][j - 1] + dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1];
	}

	public int sumRegion(int row1, int col1, int row2, int col2) {
		row1++;
		col1++;
		row2++;
		col2++;
		return dp[row2][col2] - dp[row2][col1 - 1] - dp[row1 - 1][col2] + dp[row1 - 1][col1 - 1];
	}
}

// Your NumMatrix object will be instantiated and called as such:
// NumMatrix obj = new NumMatrix(matrix);
// int param_1 = obj.sumRegion(row1,col1,row2,col2);

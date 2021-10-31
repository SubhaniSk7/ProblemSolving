package leetproblems;

public class Q221_MaximalSquare {
	public int maximalSquare(char[][] matrix) {
		int ans = 0;
		int H = matrix.length, W = matrix[0].length;
		int[][] dp = new int[H][W];

		for (int r = 0; r < H; ++r) {
			for (int c = 0; c < W; ++c) {
				if (matrix[r][c] == '1') {
					dp[r][c] = 1;
					if (r > 0 && c > 0)
						dp[r][c] += Math.min(dp[r - 1][c - 1], Math.min(dp[r - 1][c], dp[r][c - 1]));
				}
				ans = Math.max(ans, dp[r][c]);
			}
		}
		return ans * ans;
	}
}

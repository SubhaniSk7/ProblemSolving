package leetproblems;

public class Q2017_GridGame {
	public long gridGame(int[][] grid) {
		int n = grid[0].length;
		long[][] prefix = new long[2][n];

		for (int i = 0; i < 2; ++i) {
			for (int j = 0; j < n; ++j)
				prefix[i][j] = grid[i][j] + (j == 0 ? 0 : prefix[i][j - 1]);
		}
		long result = Long.MAX_VALUE;
		long second = 0;
		for (int j = 0; j < n; ++j) {
			long top = prefix[0][n - 1] - prefix[0][j];
			long bottom = (j == 0 ? 0 : prefix[1][j - 1]);
			second = Math.max(top, bottom);
			result = Math.min(result, second);
		}

		return result;
	}
}

package leetproblems;

public class Q931_MinimumFallingPathSum {
	int result = Integer.MAX_VALUE;

	public int minFallingPathSum(int[][] matrix) {
		int m = matrix.length, n = matrix[0].length;
		for (int i = 1; i < m; ++i) {
			for (int j = 0; j < n; ++j) {
				int a = matrix[i - 1][j];
				int b = matrix[i - 1][Math.max(0, j - 1)];
				int c = matrix[i - 1][Math.min(n - 1, j + 1)];
				matrix[i][j] += Math.min(a, Math.min(b, c));
			}
		}
		for (int j = 0; j < n; ++j)// last row
			result = Math.min(result, matrix[m - 1][j]);

//		for (int c = 0; c < n; ++c) {// recursive
//			int val = dfs(matrix, 0, c, 0);
//			result = Math.min(result, val);
//		}
		return result;
	}

//	public int dfs(int[][] matrix, int i, int j, int sum) {// recursive TLE
//		if (i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length)
//			return 101;
//		int a = dfs(matrix, i + 1, j - 1, sum);
//		int b = dfs(matrix, i + 1, j, sum);
//		int c = dfs(matrix, i + 1, j + 1, sum);
//		int min = Math.min(a, Math.min(b, c));
//		if (min == 101)
//			min = 0;
//		return matrix[i][j] + min;
//	}
}

package leetproblems;

public class Q1219_PathWithMaximumGold {
	int result = 0;

	public int getMaximumGold(int[][] grid) {
		int m = grid.length, n = grid[0].length;
		for (int i = 0; i < m; ++i) {
			for (int j = 0; j < n; ++j)
				rec(grid, i, j, 0);
		}
		return result;
	}

	public void rec(int[][] grid, int i, int j, int gold) {
		if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0)
			return;

		gold += grid[i][j];
		int temp = grid[i][j];
		grid[i][j] = 0;
		rec(grid, i + 1, j, gold);
		rec(grid, i - 1, j, gold);
		rec(grid, i, j + 1, gold);
		rec(grid, i, j - 1, gold);

		grid[i][j] = temp;
		result = Math.max(result, gold);
	}
}

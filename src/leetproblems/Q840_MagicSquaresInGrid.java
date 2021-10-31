package leetproblems;

public class Q840_MagicSquaresInGrid {
	public int numMagicSquaresInside(int[][] grid) {
		int m = grid.length, n = grid[0].length, result = 0;
		for (int i = 0; i < m - 2; ++i) {
			for (int j = 0; j < n - 2; ++j) {
				if (valid(grid, i, j))
					result++;
			}
		}
		return result;
	}

	public boolean valid(int[][] grid, int rStart, int cStart) {
		boolean[] nums = new boolean[10];
		for (int i = rStart; i < rStart + 3; ++i) {// rows
			int sum = 0;
			for (int j = cStart; j < cStart + 3; ++j) {
				if (grid[i][j] > 9 || grid[i][j] <= 0)
					return false;
				if (nums[grid[i][j]])
					return false;
				nums[grid[i][j]] = true;
				sum += grid[i][j];
			}
			if (sum != 15)
				return false;
		}

		nums = new boolean[10];
		for (int j = cStart; j < cStart + 3; ++j) {// columns
			int sum = 0;
			for (int i = rStart; i < rStart + 3; ++i) {
				if (grid[i][j] > 9 || grid[i][j] <= 0)
					return false;
				if (nums[grid[i][j]])
					return false;
				nums[grid[i][j]] = true;
				sum += grid[i][j];
			}
			if (sum != 15)
				return false;
		}

		int r = rStart, c = cStart;
		int sum = grid[r][c] + grid[r + 1][c + 1] + grid[r + 2][c + 2];
		if (sum != 15)
			return false;

		sum = grid[r][c + 2] + grid[r + 1][c + 1] + grid[r + 2][c];
		if (sum != 15)
			return false;
		return true;
	}
}

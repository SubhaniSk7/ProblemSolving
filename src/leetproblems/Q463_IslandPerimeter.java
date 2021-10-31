package leetproblems;

public class Q463_IslandPerimeter {
	public int islandPerimeter(int[][] grid) {
		int ans = 0, m = grid.length, n = grid[0].length;
		int[][] dir = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
		for (int r = 0; r < m; ++r) {
			for (int c = 0; c < n; ++c) {
				if (grid[r][c] == 1) {
					if (r == 0)
						ans += 1;
					if (r == m - 1)
						ans += 1;
					if (c == 0)
						ans += 1;
					if (c == n - 1)
						ans += 1;
					for (int[] d : dir) {
						int i = r + d[0], j = c + d[1];
						if (i >= 0 && i < m && j >= 0 && j < n && grid[i][j] == 0)
							ans += 1;
					}
				}
			}
		}
		return ans;
	}
}

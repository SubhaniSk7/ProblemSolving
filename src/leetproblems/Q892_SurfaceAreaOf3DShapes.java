package leetproblems;

public class Q892_SurfaceAreaOf3DShapes {
	public int surfaceArea(int[][] grid) {
		int n = grid.length, surfaceArea = 0;
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				if (grid[i][j] > 0)
					surfaceArea += 4 * grid[i][j] + 2;
				if (i > 0)
					surfaceArea -= 2 * Math.min(grid[i][j], grid[i - 1][j]);
				if (j > 0)
					surfaceArea -= 2 * Math.min(grid[i][j], grid[i][j - 1]);
			}
		}
		return surfaceArea;
	}
}

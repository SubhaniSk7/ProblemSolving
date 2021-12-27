package leetproblems;

public class Q883_ProjectionAreaOf3DShapes {
	public int projectionArea(int[][] grid) {
		int n = grid.length, area = 0;
		int[] rowMax = new int[n], colMax = new int[n];
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				area += (grid[i][j] > 0 ? 1 : 0);
				rowMax[i] = Math.max(rowMax[i], grid[i][j]);
				colMax[i] = Math.max(colMax[i], grid[j][i]);
			}
			area += rowMax[i] + colMax[i];
		}
		return area;
	}
}

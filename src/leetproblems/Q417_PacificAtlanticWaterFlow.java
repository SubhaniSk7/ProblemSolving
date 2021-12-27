package leetproblems;

import java.util.ArrayList;
import java.util.List;

public class Q417_PacificAtlanticWaterFlow {
	List<List<Integer>> result = new ArrayList<>();
	int rows, cols;

	public List<List<Integer>> pacificAtlantic(int[][] heights) {
		rows = heights.length;
		cols = heights[0].length;
		boolean[][] pacific = new boolean[rows][cols];
		boolean[][] atlantic = new boolean[rows][cols];

		for (int i = 0; i < rows; ++i) {
			dfs(i, 0, heights, pacific, Integer.MIN_VALUE);
			dfs(i, cols - 1, heights, atlantic, Integer.MIN_VALUE);
		}
		for (int j = 0; j < cols; ++j) {
			dfs(0, j, heights, pacific, Integer.MIN_VALUE);
			dfs(rows - 1, j, heights, atlantic, Integer.MIN_VALUE);
		}

		for (int i = 0; i < rows; ++i) {
			for (int j = 0; j < cols; ++j) {
				if (pacific[i][j] && atlantic[i][j]) {
					ArrayList<Integer> al = new ArrayList<>();
					al.add(i);
					al.add(j);
					result.add(al);
				}
			}
		}
		return result;
	}

	public void dfs(int r, int c, int[][] heights, boolean[][] ocean, int h) {
		if (r < 0 || r >= rows || c < 0 || c >= cols || ocean[r][c] || heights[r][c] < h)
			return;

		ocean[r][c] = true;
		dfs(r + 1, c, heights, ocean, heights[r][c]);
		dfs(r - 1, c, heights, ocean, heights[r][c]);
		dfs(r, c + 1, heights, ocean, heights[r][c]);
		dfs(r, c - 1, heights, ocean, heights[r][c]);
	}
}

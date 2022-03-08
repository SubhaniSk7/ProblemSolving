package leetproblems;

import java.util.LinkedList;
import java.util.Queue;

public class Q994_RottingOranges {
	public int orangesRotting(int[][] grid) {
		int m = grid.length, n = grid[0].length;
		Queue<int[]> q = new LinkedList<>();
		for (int i = 0; i < m; ++i) {
			for (int j = 0; j < n; ++j) {
				if (grid[i][j] == 0)
					grid[i][j] = -1;
				else if (grid[i][j] == 2) {
					grid[i][j] = 0;
					q.offer(new int[] { i, j });
				} else if (grid[i][j] == 1)
					grid[i][j] = Integer.MAX_VALUE;
			}
		}
		int min = 0;
		int[][] directions = { { -1, 0 }, { 1, 0 }, { 0, 1 }, { 0, -1 } };
		while (!q.isEmpty()) {
			int[] cur = q.poll();
			for (int[] dir : directions) {
				int r = cur[0] + dir[0];
				int c = cur[1] + dir[1];
				if (r < 0 || r >= m || c < 0 || c >= n || grid[r][c] <= grid[cur[0]][cur[1]] + 1)
					continue;
				grid[r][c] = grid[cur[0]][cur[1]] + 1;
				min = Math.max(min, grid[r][c]);
				q.offer(new int[] { r, c });
			}
		}
		for (int i = 0; i < m; ++i) {
			for (int j = 0; j < n; ++j) {
				if (grid[i][j] == Integer.MAX_VALUE)
					return -1;
			}
		}
		return min;
	}
}

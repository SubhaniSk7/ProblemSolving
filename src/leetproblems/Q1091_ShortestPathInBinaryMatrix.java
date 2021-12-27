package leetproblems;

import java.util.LinkedList;
import java.util.Queue;

public class Q1091_ShortestPathInBinaryMatrix {
	boolean[][] visited;
	int result = Integer.MAX_VALUE;
	int n;

	public int shortestPathBinaryMatrix(int[][] grid) {
		n = grid.length;
		if (grid[0][0] == 1 || grid[n - 1][n - 1] == 1)
			return -1;
		visited = new boolean[n][n];

		// dfs(grid, 0,0,0);
		bfs(grid, 0, 0);
		if (result == Integer.MAX_VALUE)
			return -1;
		return result + 1;
	}

	public void bfs(int[][] grid, int si, int sj) {
		int[][] directions = { { -1, -1 }, { -1, 0 }, { -1, 1 }, { 0, -1 }, { 0, 1 }, { 1, -1 }, { 1, 0 }, { 1, 1 } };
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] { si, sj, 0 });
		while (!q.isEmpty()) {
			int[] cur = q.poll();
			int d = cur[2];
			if (cur[0] == n - 1 && cur[1] == n - 1) {
				result = Math.min(result, d);
				continue;
			}
			for (int[] dir : directions) {

				int i = cur[0] + dir[0];
				int j = cur[1] + dir[1];
				if (i < 0 || i >= n || j < 0 || j >= n || visited[i][j] || grid[i][j] == 1)
					continue;

				visited[i][j] = true;
				q.offer(new int[] { i, j, d + 1 });
			}
		}
	}
}

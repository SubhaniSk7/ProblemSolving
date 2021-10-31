package leetproblems;

import java.util.LinkedList;
import java.util.Queue;

public class Q200_NumberOfIslands {
	public int numIslands(char[][] grid) {

		int islands = 0;
		int m = grid.length, n = grid[0].length;
		boolean[][] visited = new boolean[m][n];

		int[][] dirs = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
		for (int i = 0; i < m; ++i) {
			for (int j = 0; j < n; ++j) {
				if (!visited[i][j] && grid[i][j] == '1') {
					islands++;
					Queue<PairIsland> q = new LinkedList<>();
					visited[i][j] = true;
					q.offer(new PairIsland(i, j));

					while (!q.isEmpty()) {
						PairIsland p = q.poll();
						for (int d = 0; d < 4; ++d) {
							int r = dirs[d][0] + p.r;
							int c = dirs[d][1] + p.c;

							if ((r >= 0 && r < m && c >= 0 && c < n) && !visited[r][c] && grid[r][c] == '1') {
								q.add(new PairIsland(r, c));
								visited[r][c] = true;
							}
						}
					}
				}
			}
		}
		return islands;
	}
}

class PairIsland {
	int r;
	int c;

	PairIsland(int x, int y) {
		r = x;
		c = y;
	}
}

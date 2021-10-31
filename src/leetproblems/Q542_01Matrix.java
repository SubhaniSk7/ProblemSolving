package leetproblems;

import java.util.LinkedList;
import java.util.Queue;

public class Q542_01Matrix {
	public int[][] updateMatrix(int[][] mat) {
		int m = mat.length;
		int n = mat[0].length;
		Queue<int[]> q = new LinkedList<>();
		for (int i = 0; i < m; ++i) {
			for (int j = 0; j < n; ++j) {
				if (mat[i][j] == 1) {
					mat[i][j] = Integer.MAX_VALUE;
				} else
					q.offer(new int[] { i, j });
			}
		}

		int[][] dir = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
		while (!q.isEmpty()) {
			int[] cur = q.poll();
			for (int[] d : dir) {
				int r = cur[0] + d[0];
				int c = cur[1] + d[1];
				if (r < 0 || r >= m || c < 0 || c >= n || mat[r][c] <= mat[cur[0]][cur[1]] + 1)
					continue;
				mat[r][c] = mat[cur[0]][cur[1]] + 1;
				q.offer(new int[] { r, c });
			}
		}
		return mat;
	}
}

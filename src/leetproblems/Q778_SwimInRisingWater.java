package leetproblems;

import java.util.PriorityQueue;

public class Q778_SwimInRisingWater {
	public int swimInWater(int[][] grid) {
		int n = grid.length;
		PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (a[0] - b[0]));
		pq.add(new int[] { grid[0][0], 0, 0 });
		int result = 0;
		int[][] directions = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
		boolean[][] visited = new boolean[n][n];
		while (!pq.isEmpty()) {
			int[] cur = pq.poll();
			result = Math.max(result, cur[0]);
			if (cur[1] == n - 1 && cur[2] == n - 1)
				break;

			for (int[] dir : directions) {
				int r = cur[1] + dir[0];
				int c = cur[2] + dir[1];
				if (r < 0 || r >= n || c < 0 || c >= n || visited[r][c])
					continue;
				pq.offer(new int[] { Math.max(cur[0], grid[r][c]), r, c });
				visited[r][c] = true;
			}
		}
		return result;
	}
}

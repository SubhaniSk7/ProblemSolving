package leetproblems;

public class Q695_MaxAreaofIsland {
	boolean[][] visited;
//	public int maxAreaOfIsland(int[][] grid) {
//		return bfs(grid);
//	}
//
//	public int bfs(int[][] grid) {
//		int m = grid.length, n = grid[0].length;
//		int max = 0;
//		 visited = new boolean[m][n];
//		int[][] directions = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
//		for (int i = 0; i < m; ++i) {
//			for (int j = 0; j < n; ++j) {
//				int count = 0;
//				if (grid[i][j] == 1 && !visited[i][j]) {
//					Queue<Pair> q = new LinkedList<>();
//					q.offer(new Pair(i, j));
//					visited[i][j] = true;
//					while (!q.isEmpty()) {
//						Pair p = q.poll();
//						count++;
//						for (int[] dir : directions) {
//							int r = dir[0] + p.x;
//							int c = dir[1] + p.y;
//							if (r >= 0 && r < m && c >= 0 && c < n && !visited[r][c] && grid[r][c] == 1) {
//								visited[r][c] = true;
//								q.offer(new Pair(r, c));
//							}
//						}
//					}
//				}
//				max = Math.max(max, count);
//			}
//		}
//		return max;
//	}

//	------------------------------------------------
	public int maxAreaOfIsland(int[][] grid) {
		int m = grid.length, n = grid[0].length;
		int max = 0;
		visited = new boolean[m][n];
		for (int i = 0; i < m; ++i) {
			for (int j = 0; j < n; ++j) {
				max = Math.max(max, area(i, j, grid));
			}
		}
		return max;
	}

	public int area(int r, int c, int[][] grid) {
		if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] == 0 || visited[r][c])
			return 0;
		visited[r][c] = true;
		return 1 + area(r + 1, c, grid) + area(r - 1, c, grid) + area(r, c + 1, grid) + area(r, c - 1, grid);
	}
}

//class Pair {
//	int r, c;
//
//	Pair(int x, int y) {
//		r = x;
//		c = y;
//	}
//}

package leetproblems.days30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

import cptemplates.utils.Pair;

public class NumberOfIslands {

	public static void main(String[] subhani) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
		char[][] grid = new char[m][n];
		for (int i = 0; i < m; ++i) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; ++j)
				grid[i][j] = st.nextToken().charAt(0);
		}
		NumberOfIslands obj = new NumberOfIslands();
		System.out.println(obj.numIslands(grid));
	}

	public int numIslands(char[][] grid) {
		int islands = 0, m = grid.length, n = grid[0].length;
		boolean[][] visited = new boolean[m][n];
		int[][] dirs = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
		for (int i = 0; i < m; ++i) {
			for (int j = 0; j < n; ++j) {
				if (!visited[i][j] && grid[i][j] == '1') {// bfs
					islands++;
					Queue<Pair> q = new LinkedList<>();
					visited[i][j] = true;
					q.offer(new Pair(i, j));
					while (!q.isEmpty()) {
						Pair p = q.poll();
						for (int d = 0; d < 4; ++d) {
							int r = dirs[d][0] + p.x;
							int c = dirs[d][1] + p.y;

							if ((r >= 0 && r < m && c >= 0 && c < n) && !visited[r][c] && grid[r][c] == '1') {
								q.add(new Pair(r, c));
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
